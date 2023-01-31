<%@page import="schoolmanagement.student"%>
<%@page import="java.util.ArrayList"%>
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
	student s=em.find(student.class, id1);
	%>

	<form action="Display" method="post">
		id: <input type="text" value="<%=s.getId()%>" name="id">
		name: <input type="text" value="<%=s.getName()%>" name="name">
		branch: <input type="text" value="<%=s.getBranch()%>"name="branch">
		fee: <input type="text" value="<%=s.getFee()%>"name="fee">
		
		<input type="submit">
	</form>
</body>
</html>