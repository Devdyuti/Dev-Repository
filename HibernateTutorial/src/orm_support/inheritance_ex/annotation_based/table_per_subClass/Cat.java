package orm_support.inheritance_ex.annotation_based.table_per_subClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity(name="cat")
@Table(name="cat")
@PrimaryKeyJoinColumn(name="id")
public class Cat extends Animal {
	
	
	@Column(name="miyau")
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
