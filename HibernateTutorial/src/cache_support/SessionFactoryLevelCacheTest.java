package cache_support;

import org.dev.CHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import criteria.Employee;

public class SessionFactoryLevelCacheTest {
	public static void main(String[] args) {
		SessionFactory sf=null;
		Session session=null;
		try{
			sf=CHibernateUtil.getSessionFactory();
			session=sf.openSession();
			System.out.println("Using Fisrst Session object");
			Employee e1=(Employee)session.load(Employee.class, 44);
			System.out.println(e1.getName()+" : "+e1.getPhone());
			// Again getting same result for same session object
			Employee e2=(Employee)session.load(Employee.class, 44);
			System.out.println(e2.getName()+" : "+e2.getPhone());
			
			//Now Creating Another session object [session2] to get same result [checking for SessionFactoryLevelCache support] 
			Session	session2=sf.openSession();
			System.out.println("Using second session object");
			Employee e3=(Employee)session2.load(Employee.class, 44);
			System.out.println(e3.getName()+" : "+e3.getPhone());
			
		}catch (Exception e) {
			System.out.println("Exception SessionFactoryLevelCacheTest: "+e);
		}finally{
			session.close();
			sf.close();
		}
	}
}
