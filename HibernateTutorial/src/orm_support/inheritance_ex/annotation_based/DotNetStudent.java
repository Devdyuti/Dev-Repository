package orm_support.inheritance_ex.annotation_based;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="dotnetstudent")
@Table(name="student")
@DiscriminatorValue("ds")
public class DotNetStudent extends Student implements Serializable{

	private static final long serialVersionUID = 12L;

	
	@Column(name="sh")
	private int sh;
	
	

	public int getSh() {
		return sh;
	}

	public void setSh(int sh) {
		this.sh = sh;
	}

	public DotNetStudent() {
		// TODO Auto-generated constructor stub
	}

	public DotNetStudent(int id, String name, int rollno, String email, int sh) {
		super(id, name, rollno, email);
		this.sh=sh;
	}

}
