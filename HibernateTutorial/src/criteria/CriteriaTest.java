package criteria;

import java.util.List;

import javassist.runtime.Cflow;

import org.dev.CHibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaTest {
	
	public static void main(String[] args) {
		SessionFactory sf=null;
		Session session=null;
		Transaction tx=null;
		try{
			sf=CHibernateUtil.getSessionFactory();
			session=sf.openSession();
			
			Criteria c=session.createCriteria(Employee.class);
/*			// Getting a Single row
			Criterion cn=Restrictions.eq("eid", 43);
			c.add(cn);
			Employee e=(Employee)c.uniqueResult();
*/
/*			//Getting multiple rows
			Criterion cn=Restrictions.gt("salary", 2000.0);
			c.add(cn);
			List<Employee> list=c.list();
			for (Employee e : list) {
				System.out.println(e.getName()+" : "+e.getSalary());
			}
*/
/*			//Getting only specific column data using projection
			Projection p=Projections.property("name");
			c.setProjection(p);
			List<String> list=c.list();
			for (String  name : list) {
				System.out.println(name);
			}
*/
			
			/*Getting Multiple columns using projection 
			 * */
			Projection p1=Projections.property("name");
			Projection p2=Projections.property("email");
			ProjectionList pliList=Projections.projectionList();
			pliList.add(p1);
			pliList.add(p2);
			c.setProjection(pliList);
			List<Object[]> list=c.list();
			for (Object[] o : list) {
				System.out.print(o[0]+" : ");
				System.out.println(o[1]);
			}

			
		}catch (Exception e) {
			System.out.println("Exception in CriteriaTest: "+e);
			tx.rollback();
		}finally{
			session.close();
			sf.close();
		}
	}
}
