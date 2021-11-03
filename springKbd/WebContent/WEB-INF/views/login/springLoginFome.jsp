<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style type="text/css">

	.div1{
		background: lightblue;
		border: 1px solid red;
		width: 300px;
		height: 300px;
		margin: 100px auto;	
	}
</style>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">

	$(document).ready(function(){
		$("#mid").attr('placeholder', '아이디 ');
		$("#mpw").attr('placeholder', '비밀번호 ');
		
		$("#btn").click(function(){
			console.log("btn >>> : ");
			
			$('#loginForm').attr({
				'action':"login.h",
				'method':'POST',
				'enctype':'application/x-www-form-urlencoded'				
			}).submit();
		});
	});

</script>
</head>
<body>
<div class="div1">
<h1 align="center">Login Test</h1>
<hr>
<form name="loginForm" id="loginForm">
<table border="1" align="center">
<tr>
<td><input type="text" name="mid" id="mid" style="width:200px;"></td>
</tr>
<tr>
<td><input type="text" name="mpw" id="mpw" style="width:200px;"></td>
</tr>
<tr>
<td>
<button type="button" id="btn" style="width:208px; background-color: yellow;">로그인</button>
</td>
</tr>
<tr>
<td align="right">
<a href="idFindForm.k"><font size="2">아이디 찾기</font></a>
<a href="pwFindForm.k"><font size="2">비밀번호 찾기</font></a>
</td>
</tr>
</table>
</form>
</div>
</body>
</html>