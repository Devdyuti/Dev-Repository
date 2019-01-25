package orm_support.inheritance_ex.annotation_based.table_per_subClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity(name="dog")
@Table(name="dog")
@PrimaryKeyJoinColumn(name="id")
public class Dog extends Animal {
	
	
	@Column(name="bark")
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
