<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hello~~
<%
	System.out.print("jspService()");
%>
<%!
	public void jspInit(){
		System.out.print("jspInit()");
	}
%>
<%!
	public void jspDestrory(){
		System.out.print("jspDestroy()");
	}
%>
</body>
</html>