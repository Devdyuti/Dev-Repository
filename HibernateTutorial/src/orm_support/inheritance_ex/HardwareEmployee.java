package orm_support.inheritance_ex;

import java.io.Serializable;

public class HardwareEmployee extends Employee007 implements Serializable{

	private static final long serialVersionUID = 7L;
	
	private double wh;

	public double getWh() {
		return wh;
	}

	public void setWh(double wh) {
		this.wh = wh;
	}

	public HardwareEmployee() {
		// TODO Auto-generated constructor stub
	}

	public HardwareEmployee(int id, String name, String email, double salary, double wh) {
		super(id, name, email, salary);
		this.wh=wh;
	}
	

	
	
	
}
