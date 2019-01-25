package pagenation_support;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dev.CHibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import criteria.Employee;

public class PagenationServlet extends HttpServlet {       

	SessionFactory sf=null;
	Session session=null;
	Transaction tx=null;
	
	public void init(ServletConfig config) throws ServletException {
/*		Configuration cfg=new Configuration();
		cfg=cfg.configure();*/
		sf=CHibernateUtil.getSessionFactory();
	}

	public void destroy() {
		sf.close();
		session.close();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		session=sf.openSession();
		int fr=Integer.parseInt(request.getParameter("fr"));
		int mr=Integer.parseInt(request.getParameter("mr"));
		Query q=session.createQuery("from employee");
		// We can use Criteria instead of using HQL
		q.setFirstResult(fr); 
		q.setMaxResults(mr);
		List<Employee> list=q.list();
		for (Employee e : list) {
			out.println(e.getEid()+": Name: "+e.getName()+" Email: "+e.getEmail());
		}
	}

}
