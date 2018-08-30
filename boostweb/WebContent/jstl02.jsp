<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<%--
	request.setAttribute("n",10);
--%>
<c:set var="n" scope="request" value="10"/>
<c:set var="socre" scope="request" value="83"/>
<%
	List<String> list = new ArrayList<>();
	list.add("hello");
	list.add("world");
	
	request.setAttribute("list", list);
%>
<c:import url="http://localhost:8080/boostweb/jstl01.jsp" var="urlValue" scope="request"></c:import>
<%--
<c:redirect url="jstl01.jsp"></c:redirect>
--%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test="${n==0 }">
	n과 0은 같습니다.<br>
</c:if>

<c:if test="${n==10 }">
	n과 10은 같습니다.<br> 
</c:if>
<c:choose>
	<c:when test="${score>=90 }">
		A학점<br>
	</c:when>
	<c:when test="${score>=80 }">
		B학점<br>
	</c:when>
	<c:otherwise>
		F학점<br>
	</c:otherwise>
</c:choose>

<c:forEach items="${list }" var="item" begin="1">
	${item }<br>
</c:forEach>

읽어들인 값 : ${urlValue}

<%--
	<h1> redirect된 화면입니다.</h1>
--%>

<c:set var="t" value="<script type='text/javascript'>alert(1);</script>" />
${t}
<c:out value="${t}" escapeXml="true" />
<c:out value="${t}" escapeXml="false" />

</body>
</html>