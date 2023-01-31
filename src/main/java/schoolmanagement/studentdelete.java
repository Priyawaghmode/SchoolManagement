package schoolmanagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/dd")
public class studentdelete extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("priydarshini");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		student s1=em.find(student.class, 1);
		
		if(s1!=null)
		{
			et.begin();
			em.remove(s1);
			et.commit();
			System.out.println("delete data");
		}
		else
		{
			PrintWriter pw=resp.getWriter();
			pw.write("invalid data...");
	
		}

}
}