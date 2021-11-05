<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.cgi.kmail.CartVO" %>
<%@ page import="java.util.ArrayList" %>
<%@page import="java.text.DecimalFormat"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CART VIEW</title>
<script type="text/javascript">

	function findPay(){
		alert("결제 API 아임포트(import) 사용하기");
	}
	
	function findClear(){
		location.href="/springKbd/cgiKmail/cartClear.jsp"
	}
	
	function findGO(){
		location.href="/springKbd/cgiKmail/kosmoMail.jsp"
	}
</script>
</head>
<body>
<% request.setCharacterEncoding("EUC-KR"); %>
<%
	ArrayList<CartVO> cart = null;	
	Object obj = session.getAttribute("cart");	//세션 객체에서 cart 값을 가져온다.
	
	if(obj == null) {	//세션 정보가 없으면 배열을 생성 : 주문한 제품이 없다
		cart = new ArrayList<CartVO>();	
	} else {			//세션 정보가 있으면 강제로 캐스팅 : 주문한 제품이 있다
		cart = (ArrayList<CartVO>) obj;
	}
%>
<div align="center">
<h3>[ 장바구니 보기 ]</h3>
<hr>
<table border="1">
<tr align="center">
	<td>번호</td>
	<td>과일명</td>
	<td>단가</td>
	<td>주문 수량</td>
	<td>가격</td>
</tr>
<%
	if (cart.size() == 0){
%>
<tr align="center">
<td colspan="5">
	장바구니에 담기 상품이 없습니다
	<a href="/springKbd/cgiKmail/kosmoMail.jsp">주문하기</a>
</td>
</tr>
<% 		
	}else{
		int totalSum = 0;
		int total = 0;
		DecimalFormat df = new DecimalFormat("￦#,##0");
		for (int i=0; i < cart.size(); i++){
			CartVO cvo = cart.get(i);
%>
			<tr align="center">
				<td><%= i + 1 %></td>
				<td><%= cvo.getName() %></td>
				<td><%= df.format(cvo.getPrice()) %></td>
				<td><%= cvo.getCnt() %></td>
				<% total = cvo.getPrice() * cvo.getCnt(); %>
				<td><%= df.format(total) %></td>
			</tr>
			<% totalSum += total; %>
<%			
		}
%>
		<tr align="center">
			<td colspan="4">
			<input type="button" value="결제하기" onclick="findPay()" />
			<input type="button" value="장바구니 비우기" onclick="findClear()" />
			<input type="button" value="쇼핑 계속하기" onclick="findGo()" />
			</td>
			<td><%= df.format(totalSum) %></td>
		</tr>
<%		
	}
%>
</table>
</div>
</body>
</html>
