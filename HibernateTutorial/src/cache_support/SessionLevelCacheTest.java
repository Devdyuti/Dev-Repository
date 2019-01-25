package cache_support;

import org.dev.CHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import criteria.Employee;

public class SessionLevelCacheTest {
	public static void main(String[] args) {
		SessionFactory sf=null;
		Session session=null;
		try{
			sf=CHibernateUtil.getSessionFactory();
			session=sf.openSession();
			Employee e=(Employee) session.load(Employee.class, 44);
			System.out.println(e.getName()+" "+e.getEmail());
			Employee e2=(Employee) session.load(Employee.class, 44);
			System.out.println(e2.getName()+" "+e2.getEmail());
			/*In above 2 statement Hibernate will hit only one time to database for the same query 
			 *@ But if we try to call same query with different session object then 2 times database will hit: Hibernate will call same query
			 *2 times for same operation 
			 *@ this is the concept of SesionLevelCache
			 *@ SessionLevelCache is default cache*/
			Session session2=sf.openSession();
			Employee e3=(Employee) session2.load(Employee.class, 44);/*Observe this carefully*/
			System.out.println(e3.getName()+" "+e3.getEmail());
			
		}catch (Exception e) {
			System.out.println("Exception in SessionLevelCacheTest: "+e);
		}finally{
			
		}
	}
}
