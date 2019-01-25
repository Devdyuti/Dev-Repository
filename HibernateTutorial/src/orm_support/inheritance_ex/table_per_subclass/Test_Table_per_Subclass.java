package orm_support.inheritance_ex.table_per_subclass;

import org.dev.CHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test_Table_per_Subclass {

	public static void main(String[] args) {
		
		SessionFactory sf=null;
		Session session=null;
		Transaction tx=null;
		try{
			sf=CHibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			Dog d=new Dog(1, "GermanShefard", 10, "bark");
			Cat c=new Cat(2, "HomeCat", 5, "miyau");
			
			session.save(d);
			session.save(c);
			

			tx.commit();
			
		}catch (Exception e) {
			System.out.println("Exception in Test_Table_per_Subclass: "+e);
			tx.rollback();
		}finally{
			session.close();
			sf.close();
		}

	}

}
