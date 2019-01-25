package orm_support.inheritance_ex.table_per_subclass;

public class Dog extends Animal {
	private String bark;

	public String getBark() {
		return bark;
	}

	public void setBark(String bark) {
		this.bark = bark;
	}

	public Dog(int id, String name, int age, String bark) {
		super(id, name, age);
		this.bark = bark;
	}

	
	
}
