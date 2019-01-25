package orm_support.inheritance_ex;

import java.io.Serializable;

public class SoftwareEmployee extends Employee007 implements Serializable{

	private static final long serialVersionUID = 7L;
	
	private String tool;

	
	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
	
	
	public SoftwareEmployee() {
		// TODO Auto-generated constructor stub
	}
	public SoftwareEmployee(int id, String name, String email, double salary, String tool) {
		super(id, name, email, salary);
		this.tool=tool;
	}
	
	
	
	
}
