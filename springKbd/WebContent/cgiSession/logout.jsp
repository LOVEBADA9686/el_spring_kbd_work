<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.cgi.session.K_Session" %>

<% request.setCharacterEncoding("UTF-8");%>

<%
	K_Session ks = K_Session.getInstance();

	String kID = ks.getSession(request);
	
	if (kID !=null) {
		out.println("kID >>> : " + kID + "<br>");
		ks.killSession(request);
		out.println( "<h3>session out</h3>");	
	}
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
<hr>

<a href="/springKbd/cgiSession/login.html">로그인 하러가기</a>
</body>
</html>