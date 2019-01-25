package orm_support.inheritance_ex.table_per_subclass;

public class Cat extends Animal {
	private String miyau;
	
	public String getMiyau() {
		return miyau;
	}
	public void setMiyau(String miyau) {
		this.miyau = miyau;
	}
	
	public Cat(int id, String name, int age, String miyau) {
		super(id, name, age);
		this.miyau = miyau;
	}
	
	
}
