<%@page import="schoolmanagement.teacher"%>
<%@page import="schoolmanagement.student"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String id=request.getParameter("id");
	int id1=Integer.parseInt(id);
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("priydarshini");
	EntityManager em = emf.createEntityManager();
	teacher t=em.find(teacher.class, id1);
	%>

	<form action="update" method="post">
		id: <input type="text" value="<%=t.getId()%>" name="id">
		name: <input type="text" value="<%=t.getName()%>" name="name">
		sub: <input type="text" value="<%=t.getSub()%>"name="sub">
		sal: <input type="text" value="<%=t.getSal()%>"name="sal">
		
		<input type="submit">
	</form>




</body>
</html>