package org.dev;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main{
	public static void main(String[] args) {
		Transaction tx=null;
		Session session=null;
		SessionFactory cf=null;
		try{
			cf=CHibernateUtil.getSessionFactory();
			session=cf.openSession();
			tx=session.beginTransaction();
	/*Adding a object into database using save(), persist() and saveOrUpdate() methods
	*/		
/*			Customers cus=new Customers("ravi", "ravi@gmail.com",95558482);			
			Integer i =(Integer)session.save(cus);// Persist state: Customer object is in persistant state
			//session.persist(cus);
			tx.commit();
			if(i!=null){
				System.out.println("Record Inserted Sucessfully!!");
			}*/
	//Updating a object using update(), merge() : Difference between update and merge.
	 	
//			Customers cuss=(Customers)session.load(Customers.class, 23);
//			System.out.println(cuss.getName()+" "+cuss.getEmail());
//			cuss.setName("Dirty updated");
//			
//			tx.commit ();
			
			
			
			
/*			Customers cus=new Customers();
			cus.setId(24);
			cus.setName("bhabhiyaC");
			cus.setEmail("raviya@gmail.com");
			cus.setPhone(92228482);
			session.update(cus);
			tx.commit();*/
			
			/** Difference between Update and Merge 
			 *
			 */
			Customers cus=(Customers)session.load(Customers.class, 22);
			System.out.println(cus.getName()+" "+cus.getEmail());
			
			Customers cuss=new Customers();
			cuss.setId(23);
			cuss.setName("dev_upd");
			cuss.setEmail("dev_upd@gmail.com");
			session.update(cuss);
			tx.commit();
			
			 
			session.evict(cuss);
			session.evict(cus);// Deattaiched state: Customer object removed from persistant : Now Customer object eligible for gc
		}catch (Exception e) {
			System.out.println("Record Not inserted: "+e);
			tx.rollback();
		}finally{
			session.close();
			cf.close();
		}
	}
}
