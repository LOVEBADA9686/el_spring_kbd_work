<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.cgi.session.K_SessionManager" %>

<% request.setCharacterEncoding("UTF-8"); %>

<% 
	K_SessionManager kManager = K_SessionManager.getInstance();
	session.invalidate();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 보기</title>
</head>
<body>
<br>
<p>
로그인정보
<hr>

<a href="/springKbd/cgiSessionBind/bindSession.jsp">로그인 정보 보러가기.</a>
</body>
</html>