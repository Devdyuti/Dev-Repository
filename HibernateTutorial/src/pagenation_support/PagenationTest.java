package pagenation_support;

import java.util.List;

import org.dev.CHibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import criteria.Employee;

public class PagenationTest {
	public static void main(String[] args) {
		SessionFactory sf=null;
		Session session=null;
		Transaction tx=null;
		try{
			sf=CHibernateUtil.getSessionFactory();
			session=sf.openSession();
			Query q=session.createQuery("from employee");
			q.setFirstResult(1);
			q.setMaxResults(3);
			List<Employee> list=q.list();
			for (Employee e : list) {
				System.out.println("Name: "+e.getName()+""+" Email: "+e.getEmail());
			}
			
		}catch (Exception e) {
			System.out.println("Exception in PagenationTest: "+e);
		}finally{
			
		}		
	}
}
