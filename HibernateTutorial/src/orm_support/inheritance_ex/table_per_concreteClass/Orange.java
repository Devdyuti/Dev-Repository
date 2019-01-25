package orm_support.inheritance_ex.table_per_concreteClass;

public class Orange extends Fruit {
	
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public Orange(int id, String name, String location,String color) {
		super(id, name, location);
		this.color=color;
	}

}
