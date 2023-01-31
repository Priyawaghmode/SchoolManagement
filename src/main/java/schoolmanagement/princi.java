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
@WebServlet("/pp")
public class princi  extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("priydarshini");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();

		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String email=req.getParameter("email");
		String p=req.getParameter("mobileno");
		String pass=req.getParameter("pass");
		
		
		principle p1=new principle(name, age, email, pass, p);
		
		
	
		
		et.begin();
		em.persist(p1);
		et.commit();
		
		PrintWriter pw=resp.getWriter();
		pw.write("Account Created...");
		RequestDispatcher r=req.getRequestDispatcher("login.html");
		r.forward(req, resp);
		resp.setContentType("text/html");
	}
}