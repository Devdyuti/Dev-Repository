package hql_support;



import java.util.List;

import org.dev.CHibernateUtil;
import org.dev.Customers;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**Tutorial HQL test
 * Shifing table data from old table to new Table
 * */
public class TestHQL {
		
	public static void main(String[] args) {
		
		Transaction tx=null;
		Session session=null;
		SessionFactory cf=null;
		
		try{
			cf=CHibernateUtil.getSessionFactory();
			session=cf.openSession();
			// hql for transfer data from 1 table to newly created table
/*			String hql="insert into customers_new(id,name,email,phone) select s.id, s.name, s.email, s.phone from customers s";
			Query q= session.createQuery(hql);
			int i=q.executeUpdate();
			if(i!=0){
				System.out.println("Table data transfered Sucessfully!!!");
			}*/
			
			// To get single row of table
/*			String hql="from customers c where c.id=24";
			Query q=session.createQuery(hql);
			Customers c=(Customers)q.uniqueResult();
			if(c!=null){
				System.out.println(c.getName()+" "+c.getEmail());
			}*/
			
			// to get multiple records
			String hql="from customers";
			Query q=session.createQuery(hql);
			List<Customers> list=q.list();
			for (Customers customers : list) {
				System.out.println(customers.getName()+" : "+customers.getPhone());
			}

			
		}catch (Exception e) {
			System.out.println("Exception in Transfer data: "+e);
			tx.rollback();
		}finally{
			session.close();
			cf.close();
		}	
	}
	
}
