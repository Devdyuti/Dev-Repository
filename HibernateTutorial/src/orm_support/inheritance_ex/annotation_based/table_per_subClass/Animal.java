package orm_support.inheritance_ex.annotation_based.table_per_subClass;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name="animal")
@Table(name="animal")
@Inheritance(strategy=InheritanceType.JOINED)
public class Animal implements Serializable{
	
	private static final long serialVersionUID = -21239499605863394L;
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="age")
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
