package orm_support.inheritance_ex.annotation_based;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="scallastudent")
@Table(name="student")
@DiscriminatorValue("ss")
public class ScallaStudent extends Student implements Serializable{
	
	private static final long serialVersionUID = 13L;
	
	
	@Column(name="scalla")
	private String scalla;
	
	public String getScalla() {
		return scalla;
	}

	public void setScalla(String scalla) {
		this.scalla = scalla;
	}

	public ScallaStudent() {
		// TODO Auto-generated constructor stub
	}

	public ScallaStudent(int id, String name, int rollno, String email, String scalla) {
		super(id, name, rollno, email);
		this.scalla=scalla;
	}

}
