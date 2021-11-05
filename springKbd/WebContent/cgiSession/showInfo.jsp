<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.cgi.session.K_Session" %>

<%
	request.setCharacterEncoding("UTF-8");
	K_Session ks = K_Session.getInstance();
	String kID =ks.getSession(request);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 보기</title>
</head>
<body>
로그인정보
<hr>
<%
	if (kID !=null && kID.length() > 0){
%>
	아이디 : <%= kID %><p><br>
	<a href="/springKbd/cgiSession/logout.jsp">로그아웃 하러가기</a><br>
<%
	}else{
%>
	로그인 정보가 없습니다.<br>
	<a href="/springKbd/cgiSession/login.html">로그인 하러가기</a>
<%
	}
%>
</body>
</html>