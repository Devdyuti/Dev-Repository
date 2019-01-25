package orm_support.association_ex.annotation_based;

import java.util.HashSet;
import java.util.Set;

import org.dev.CHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test_OneToMany {

	public static void main(String[] args) {

		SessionFactory sf=null;
		Session session=null;
		Transaction tx=null;
		try{
			sf=CHibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			Actor a1=new Actor(1,"Amir khan");
			Actor a2=new Actor(2,"Ajay Devgan");
			Actor a3=new Actor(3,"Salmaan Khan");
			
			Movie m1=new Movie(1, "PK", a1.getAid());
			Movie m2=new Movie(2, "3-Idoits", a1.getAid());
			Movie m3=new Movie(3, "Gangajal", a2.getAid());
			Movie m4=new Movie(4, "Apharan", a2.getAid());
			Movie m5=new Movie(5, "Dabang", a3.getAid());
			Movie m6=new Movie(6, "Wanted", a3.getAid());
			Set<Movie> amir_movies=new HashSet<Movie>();
			amir_movies.add(m1);
			amir_movies.add(m2);
			Set<Movie> ajay_movies=new HashSet<Movie>();
			ajay_movies.add(m3);
			ajay_movies.add(m4);
			Set<Movie> salmaan_movies=new HashSet<Movie>();
			salmaan_movies.add(m5);
			salmaan_movies.add(m6);
			
			a1.setMovies(amir_movies);
			a2.setMovies(ajay_movies);
			a3.setMovies(salmaan_movies);
			
			session.save(m1);
			session.save(m2);
			session.save(m3);
			session.save(m4);
			session.save(m5);
			session.save(m6);
			session.save(a1);
			session.save(a2);
			session.save(a3);
			tx.commit();
			System.out.println("Record Inserted Sucessfully!");
			
		}catch (Exception e) {
			System.out.println("Exception in Test_OneToMany: ");
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
			sf.close();
		}

	}

}
