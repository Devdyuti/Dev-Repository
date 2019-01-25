package orm_support.association_ex.xml_based;

import java.util.HashSet;
import java.util.Set;

import org.dev.CHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ManyToMany_Test {
	public static void main(String[] args) {
		SessionFactory sf=null;
		Session session=null;
		Transaction tx=null;
		try{
			sf=CHibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			Courses c1=new Courses(1, "SCJP", 1000);
			Courses c2=new Courses(2, "SPRING", 2000);
			Courses c3=new Courses(3, "HIBERNATE", 3000);
			Courses c4=new Courses(4, "STRUTS", 4000);
			
			Set<Courses> cSet=new HashSet<Courses>();
			cSet.add(c1);
			cSet.add(c2);
			Set<Courses> cSet1=new HashSet<Courses>();
			cSet1.add(c3);
			cSet1.add(c4);
			
			Faculty f1=new Faculty(1, "DURGA", 10);
			Faculty f2=new Faculty(2, "NAVEEN", 5);
			Faculty f3=new Faculty(3, "MANISH", 3);
			f1.setCourses(cSet);
			f2.setCourses(cSet1);
			f3.setCourses(cSet1);
			
			session.saveOrUpdate(f1);
			session.saveOrUpdate(f2);
			session.saveOrUpdate(f3);
			session.saveOrUpdate(c1);
			session.saveOrUpdate(c2);
			session.saveOrUpdate(c3);
			session.saveOrUpdate(c4);
			
			
			tx.commit();
			System.out.println("Record Inserted Sucessfully!");
			
		}catch (Exception e) {
			System.out.println("Exception in ManyToMany_Test: ");
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
			sf.close();
		}
	}
}
