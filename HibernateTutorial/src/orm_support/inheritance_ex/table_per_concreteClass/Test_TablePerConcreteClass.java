package orm_support.inheritance_ex.table_per_concreteClass;

import org.dev.CHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test_TablePerConcreteClass {

	public static void main(String[] args) {
		SessionFactory sf=null;
		Session session=null;
		Transaction tx=null;
		try{
			sf=CHibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			Apple a=new Apple(1, "Apple", "srinager", "chocklaty");
			Orange o=new Orange(2, "Orange", "Naaagpur", "red");
			
			session.save(a);
			session.save(o);

			tx.commit();
			
		}catch (Exception e) {
			System.out.println("Exception in Test_TablePerConcreteClass: "+e);
			tx.rollback();
		}finally{
			session.close();
			sf.close();
		}
	}

}
