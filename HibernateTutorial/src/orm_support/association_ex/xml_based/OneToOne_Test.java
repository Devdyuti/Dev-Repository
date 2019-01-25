package orm_support.association_ex.xml_based;

import java.util.Date;

import org.dev.CHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToOne_Test {
	public static void main(String[] args) {
		SessionFactory sf=null;
		Session session=null;
		Transaction tx=null;
		try{
			sf=CHibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			Voter v=new Voter(1, "Dev", 40);
			
			Vote vt=new Vote("RJD", new Date());
			vt.setVoter(v);
			
			session.save(v);
			session.save(vt);
			
			tx.commit();
			System.out.println("Record Inserted Sucessfully!");
			
		}catch (Exception e) {
			System.out.println("Exception in OneToOne_Test: ");
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
			sf.close();
		}
	}
}
