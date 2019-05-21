<%@page import="com.exe.springmvc.PersonDTO"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
	
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	String email = request.getParameter("email");
	PersonDTO dto = (PersonDTO)request.getAttribute("dto");//downcast
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>paramResult</title>
</head>
<body>
<h2>paramResult</h2>
이름: <%=name %>
전화: <%=phone %>
이메일: <%=email %>
<br><br>

<h2>ModelAndView</h2>
<%if(dto!=null){ %>
	이름: <%=dto.getName() %>
	전화: <%=dto.getPhone() %>
	이메일: <%=dto.getEmail() %>
<%}else{ %>
	데이터 없음
<%} %>
</body>
</html>