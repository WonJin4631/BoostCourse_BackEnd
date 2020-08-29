<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
id : <%=getId() %>
<%!
    String id = "u001"; //멤버변수 선언
    public String getId( ) { //메소드 선언
        return id;
    }
%>

<%
	for(int i=1;i<=5;i++){
%>
<H<%=i %>>아름다운 한글</H<%=i %>>
<%	 
	}
%>


<%--
	jsp 주석
 --%>
 
<!-- 
	html 주석
 -->
 
 <%
 // java 주석
 %>
</body>
</html>