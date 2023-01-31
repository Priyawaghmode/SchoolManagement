package schoolmanagement;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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


@WebServlet("/Display")
public class studentdisplay extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("priydarshini");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String Branch=req.getParameter("Branch");
		String fee=req.getParameter("fee");
		
		int id1=Integer.parseInt(id);
		int fees1=Integer.parseInt(fee);
		
		student s=new student(id1,name,Branch,fees1);
		    
		    PrintWriter pw=resp.getWriter();
			pw.write("value inserted...");
			RequestDispatcher r=req.getRequestDispatcher("Student.html");
			r.forward(req, resp);
			resp.setContentType("text/html");
	
		

	}

}
