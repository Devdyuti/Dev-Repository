package autoddlsupport.main;

import org.hibernate.cfg.Configuration;



public class AutoDDL_Test {
	public static void main(String[] args) {
				
		try{
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.buildSessionFactory();
			
		}catch (Exception e) {
			System.out.println("Exception in AutoDDL_Test: "+e);
		}finally{
			
		}
	}
}	
