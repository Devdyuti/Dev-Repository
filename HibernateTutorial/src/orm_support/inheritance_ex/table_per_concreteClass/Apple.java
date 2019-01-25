package orm_support.inheritance_ex.table_per_concreteClass;

public class Apple extends Fruit {
	
	String subcat;
	
	public String getSubcat() {
		return subcat;
	}
	public void setSubcat(String subcat) {
		this.subcat = subcat;
	}

	public Apple(int id, String name, String location, String subcat) {
		super(id, name, location);
		this.subcat=subcat;
	}

}
