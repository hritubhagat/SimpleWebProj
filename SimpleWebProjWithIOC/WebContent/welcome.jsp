<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.bhagat.hritu.dto.UserDTO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<%
 UserDTO dto=(UserDTO)session.getAttribute("user");
%>
<div align="center"><font color="green" size="10">Welcome <%=dto.getFirstName()%>&nbsp;<%=dto.getLastName() %></font></div>
</body>
</html>