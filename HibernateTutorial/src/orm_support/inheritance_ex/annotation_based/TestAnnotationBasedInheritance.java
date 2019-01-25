package orm_support.inheritance_ex.annotation_based;

import org.dev.CHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class TestAnnotationBasedInheritance {

	public static void main(String[] args) {
		SessionFactory sf=null;
		Session session=null;
		Transaction tx=null;
		try{
			sf=CHibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			JavaStudent js=new JavaStudent(111, "Dev", 249, "dev@gmail.com", "Hibernate");
			DotNetStudent ds=new DotNetStudent(222, "Gyani", 349, "gyan@gmail.com", 10);
			ScallaStudent ss=new ScallaStudent(333, "Sanjjay", 420, "san@hotmail.com", "yes");
			
			session.save(js);
			session.save(ds);
			session.save(ss);
			tx.commit();
			
		}catch (Exception e) {
			System.out.println("Exception in TestAnnotationBasedInheritance: ");
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
			sf.close();
		}
	}

}
