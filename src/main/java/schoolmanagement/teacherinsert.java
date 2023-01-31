package schoolmanagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addt")
public class teacherinsert extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("priydarshini");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String sub=req.getParameter("sub");
		String sal=req.getParameter("sal");
		
		int id1=Integer.parseInt(id);
		double sal1=Double.parseDouble(sal);
		
		teacher t=new teacher(id1,name,sub,sal1);
		
		et.begin();
		em.persist(t);
		et.commit();
		
		PrintWriter pw=resp.getWriter();
		pw.write("value inserted...");
		RequestDispatcher r=req.getRequestDispatcher("Teacher.html");
		r.forward(req, resp);
		resp.setContentType("text/html");

	}

}
