package orm_support.inheritance_ex.annotation_based;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name="student")
@Table(name="student")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="stype", discriminatorType=DiscriminatorType.STRING, length=20)
public class Student implements Serializable{

	private static final long serialVersionUID = 10L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="rollno")
	private int rollno;
	@Column(name="email")
	private String email;
	
	
	
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

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, int rollno, String email) {
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.email = email;
	}
	
	
	
}
