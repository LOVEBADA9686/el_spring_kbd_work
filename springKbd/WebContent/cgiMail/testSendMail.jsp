<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.cgi.mail.GooleMailSend" %>

<%
	String sendMailSubject = request.getParameter("sendMailSubject");
	String sendMail = request.getParameter("sendMail");
	String sendPw = request.getParameter("sendPw");
	String resiveMail = request.getParameter("resiveMail");
	String sendMsg = request.getParameter("sendMsg");
	
	System.out.println("sendMailSubject >>> : " + sendMailSubject);
	System.out.println("sendMail >>> : " + sendMail);
	System.out.println("sendPw >>> : " + sendPw);
	System.out.println("resiveMail >>> : " + resiveMail);
	System.out.println("sendMsg >>> : " + sendMsg);
	
	GoogleMailSend gms = new GoogleMailSend();
	gms.googleMailSend(sendMailSubject, sendMail, sendPw, resiveMail, sendMsg);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>