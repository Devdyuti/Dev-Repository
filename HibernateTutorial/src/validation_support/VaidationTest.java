package validation_support;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.dev.CHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class VaidationTest {

	public static void main(String[] args) {
		SessionFactory sf=null;
		Transaction tx=null;
		Session session=null;
		try{
			sf=CHibernateUtil.getSessionFactory();
			session=sf.openSession();
			tx=session.beginTransaction();
			
			Friend f=new Friend("Devdyuti", "dev@gmail.com", "new delhi", 74287666);
			/*Try to insert wrong data in fields immediately Hibernate-validator validates input before processing */
			
			ValidatorFactory vf=Validation.buildDefaultValidatorFactory();
			Validator v=vf.getValidator();
			Set<ConstraintViolation<Friend>> seterror=v.validate(f);
			
			if(!seterror.isEmpty()){
				for (ConstraintViolation<Friend> error : seterror) {
					System.out.println(error.getPropertyPath()+" : "+error.getMessage());
				}
			}else{
				int i=(Integer)session.save(f);
				tx.commit();
				if(i!=0)
					System.out.println("Record inserted sucessfully!: PK-"+i);
			}
			
			
			
			// To remove a persistent object from Database state to become now attaich state 
			session.evict(f);
		}catch (Exception e) {
			System.out.println("Exception in VaidationTest: ");
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
			sf.close();
		}
	}

}
