package orm_support.inheritance_ex;

import java.io.Serializable;

public class AdminEmployee extends Employee007 implements Serializable{
	
	private static final long serialVersionUID = 8L;
	
	private String branch;
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public AdminEmployee() {
		// TODO Auto-generated constructor stub
	}
	public AdminEmployee(int id, String name, String email, double salary, String branch) {
		super(id, name, email, salary);
		this.branch=branch;
	}

	
	
	
}
