package schoolmanagement;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ll")
public class login extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("priydarshini");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();

		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		Query q=em.createQuery("select a from principle a where a.mail='"+email+"' and a.pass='"+pass+"'");
		List<principle> p=q.getResultList();
		if(!p.isEmpty())
		{
			RequestDispatcher r=req.getRequestDispatcher("TeacherStudent.html");
			r.forward(req, resp);
		}
		else
		{
			PrintWriter pw=resp.getWriter();
			pw.write("Invalid creaditional..........");
			RequestDispatcher r=req.getRequestDispatcher("login.html");
			r.forward(req, resp);
			resp.setContentType("text/html");
			
			
		}
	}

}
