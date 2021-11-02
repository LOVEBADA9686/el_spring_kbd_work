package a.b.c.com.mem.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.mem.vo.SpringMemberVO;

@Repository
public class SpringMemberDAOImpl implements SpringMemberDAO {
	Logger logger = Logger.getLogger(SpringMemberDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;

	@Override
	public List<SpringMemberVO> memberSelectAll(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("SpringMemberDAOImpl memberSelectAll() 함수 진입 >>> : ");
		return sqlSession.selectList("memberSelectAll", mvo);
	}

	@Override
	public List<SpringMemberVO> memberSelect(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("SpringMemberDAOImpl memberSelect() 함수 진입 >>> : ");
		return sqlSession.selectList("memberSelect", mvo);
	}

	@Override
	public int memberInsert(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("SpringMemberDAOImpl memberInsert() 함수 진입 >>> : ");
		return (Integer)sqlSession.insert("memberInsert", mvo);
	}

	@Override
	public int memberUpdate(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("SpringMemberDAOImpl memberUpdate() 함수 진입 >>> : ");
		return (Integer)sqlSession.update("memberUpdate", mvo);
	}

	@Override
	public int memberDelete(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("SpringMemberDAOImpl memberDelete() 함수 진입 >>> : ");
		return (Integer)sqlSession.delete("memberDelete", mvo);
	}

	@Override
	public List<SpringMemberVO> memberIdCheck(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("SpringMemberDAOImpl memberIdCheck() 함수 진입 >>> : ");
		return sqlSession.selectList("memberIdCheck", mvo);
	}

}
