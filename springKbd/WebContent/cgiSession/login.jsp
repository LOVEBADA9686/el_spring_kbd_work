<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="a.b.c.com.cgi.session.K_Session" %>   

<% request.setCharacterEncoding("EUC-KR");%>
    
<%
	String mid = request.getParameter("mid");
	String mpw = request.getParameter("mpw");
	System.out.println(mid);
	System.out.println(mpw);
	
	int nCnt = 0;
	boolean result = false;
	
	Context context = new InitialContext();
	DataSource dataSource = (DataSource)
	context.lookup("java:comp/env/jdbc/Oracle11g_orcl");
	Connection conn = dataSource.getConnection();
	
	String sqls = "SELECT COUNT(A.MID) NCNT FROM SPRING_MEMBER A WHERE A.MID = ? AND A.MPW = ? ";
	PreparedStatement pstmt = conn.prepareStatement(sqls);

	pstmt.setString(1, mid);
	pstmt.setString(2, mpw);
	ResultSet rsRs = pstmt.executeQuery();
	
	while (rsRs.next()){
		nCnt = rsRs.getInt(1);
	}
		
	if (nCnt == 1) result = true;	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션정보 처리하기</title>
</head>
<body>
<%
	if (result){
		
		K_Session ks = K_Session.getInstance();
		
		String kID = ks.getSession(request);	
		
		if (kID !=null && kID.equals(mid)){
			out.println("이미 로그인 중 입니다. >>> : ");
%>
	<script>
		alert("안녕하세요 : <%= mid %> 님 !! 이미 로그인 중 이십니다. >>> : ");
		location.href="/springKbd/cgiSession/showInfo.jsp";
	</script>

<%
		}else{
			ks.setSession(request, mid);
%>			
		<h3> 안녕하세요 : <%= mid %> 님 </h3>
		<a href="/springKbd/cgiSession/showInfo.jsp">로그인 정보 보기</a>
<%
		}
	}else{
%>	

		<h3>로그인에 실패했습니다.</h3>
		<h3>아이디 및 패스워드를 확인해 주십시오.</h3>
		<a href="/springKbd/cgiSession/login.html">로그인 하러가기</a>
<%
	}
%>
</body>
</html>