package orm_support.association_ex.xml_based;

import java.util.HashSet;
import java.util.Set;

import org.dev.CHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ManyToOneTest {

	public static void main(String[] args) {
		SessionFactory sf=null;
		Session session=null;
		Transaction tx=null;
		try{
			sf=CHibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			Actor_M_to_1 a=new Actor_M_to_1(1,"AMIR KHAN");
			
			Movie_M_to_1 m1=new Movie_M_to_1(1,"PK");
			m1.setActor(a);
			Movie_M_to_1 m2=new Movie_M_to_1(2,"LAGAAN");
			m2.setActor(a);
			
			session.save(m1);
			session.save(m2);
			session.save(a);
			
			tx.commit();
			System.out.println("Record Inserted Sucessfully!");
			
		}catch (Exception e) {
			System.out.println("Exception in OneToManyTest: ");
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
			sf.close();
		}
	}

}
