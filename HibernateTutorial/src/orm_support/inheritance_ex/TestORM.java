package orm_support.inheritance_ex;
 
import org.dev.CHibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import criteria.Employee;

public class TestORM {
	public static void main(String[] args) {
		SessionFactory sf=null;
		Session session=null;
		Transaction tx=null;
		try{
			sf=CHibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			SoftwareEmployee se=new SoftwareEmployee(111,"Devdyuti","dev@gmail.com",40000,"Hibernate");
			HardwareEmployee he=new HardwareEmployee(222, "Ravi", "Ravi@ymail.com", 10000, 8.0);
			AdminEmployee admin=new AdminEmployee(333, "Ritesh", "gkhare@artinfo.com", 70000, "IT");
			
			session.save(se);
			session.save(he);
			session.save(admin);
			tx.commit();
			
		}catch (Exception e) {
			System.out.println("Exception in TestORM: "+e);
			tx.rollback();
		}finally{
			session.close();
			sf.close();
		}
	}
}
