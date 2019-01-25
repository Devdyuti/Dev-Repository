package cache_support;

import java.util.List;

import org.dev.CHibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import criteria.Employee;

public class QueryCacheSupportTest {

	public static void main(String[] args) {
		SessionFactory sf=null;
		Session session=null;
		try{
			sf=CHibernateUtil.getSessionFactory();
			session=sf.openSession();
			System.out.println("For first Query");
			Query q1=session.createQuery("from employee");
			q1.setCacheable(true);
			List<Employee> list= q1.list();
			for (Employee e : list) {
				System.out.println(e.getName());
			}
			
			System.out.println("For second query");
			Query q2=session.createQuery("from employee");
			q2.setCacheable(true);
			List<Employee> list2= q2.list();
			for (Employee e : list2) {
				System.out.println(e.getName());
			}
			
		}catch (Exception e) {
			System.out.println("Exception in QueryCacheSupportTest: "+e);
		}finally{
			
		}

	}

}
