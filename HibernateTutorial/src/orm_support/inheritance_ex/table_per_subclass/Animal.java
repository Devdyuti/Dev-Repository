package orm_support.inheritance_ex.table_per_subclass;

public class Animal {

	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	
	
	
}
