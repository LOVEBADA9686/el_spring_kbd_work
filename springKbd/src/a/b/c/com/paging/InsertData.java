/*
-- 데이타 1000000 건을 넣기위해 수정
CREATE TABLE SE_BOARD(
	mnum		NUMBER(8)			NOT NULL,
	mtitle		VARCHAR2(50)		NOT NULL,
	mname		VARCHAR2(20)		NOT NULL,
	memail		VARCHAR2(50)		NOT NULL,
	marea		VARCHAR2(2000)		NOT NULL,
	mpass		VARCHAR2(20)		NOT NULL,
	mref		NUMBER(8)			NULL,
	mstep		NUMBER(8)			NULL,
	mdepth		NUMBER(8)			NULL,
	mwriteday	DATE				DEFAULT SYSDATE,
	mhits		NUMBER(8)			NULL
);

CREATE SEQUENCE B_SEQ INCREMENT BY 1 START WITH 1;

*-----------------------------------------------------------------------
* descripton
* mref     :	원본 게시물 번호
* mstep    :	같은 원본 게시물에 대한 답변글 내에서의 순서 
* mdepth   :	답변의 단계 (예, 원본=0, 원본의 답변=1, 답변의 답변=2, ...)
*-----------------------------------------------------------------------
*
*/


package a.b.c.com.paging;

import java.sql.Connection;
import java.sql.Statement;

public class InsertData {
	
	public void insertData() throws Exception{
		
		Connection con = ConnProperty.getConnection();
		Statement stmt = con.createStatement();
		String sqls = null;

	
		//for(long i = 0; i < 10000000; i++)
		for(long i = 0; i < 200; i++) {
			sqls = "INSERT INTO SE_BOARD VALUES ("
									+ "B_SEQ.NEXTVAL, "
									+ "'" + i + "', "
									+ "'" + i + "', "
									+ "'" + i + "', "
									+ "'" + i + "', "
									+ "'" + i + "', "
									+ " 1, 1, 1, DEFAULT, 1)";
		
			int nCount = stmt.executeUpdate(sqls);
			//if (nCount % 1000 == 0) con.commit();
			if (nCount % 100 == 0) con.commit();
		}	
	
		con.commit();
		stmt.close();stmt = null;
		con.close();con = null;
	}

	public static void main(String[] args) throws Exception{
		new InsertData().insertData();
	}
}
