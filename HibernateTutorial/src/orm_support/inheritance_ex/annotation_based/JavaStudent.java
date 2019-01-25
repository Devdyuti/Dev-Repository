package orm_support.inheritance_ex.annotation_based;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="javastudent")
@Table(name="student")
@DiscriminatorValue("js")
public class JavaStudent extends Student  implements Serializable{
	
	private static final long serialVersionUID = 11L;
	
	
	@Column(name="tool")
	private String tool;

	
	
	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}

	public JavaStudent() {
	}

	public JavaStudent(int id, String name, int rollno, String email, String tool) {
		super(id, name, rollno, email);
		this.tool=tool;
	}
	
	

}
