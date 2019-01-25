package validation_support;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

//import com.sun.istack.internal.NotNull;



@Entity
@Table(name="friend", schema="system" )
public class Friend implements Serializable{
	
	private static final long serialVersionUID = 3321749077385987766L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="fid")
	private int id;
	
	@NotEmpty(message="Name should not be left blank")
	private String name;
	@NotEmpty(message="Email shouldn't be left blank")
	@Email(message="Wrong email format")
	private String email;
	@NotEmpty(message="location cant't be left blank")
	private String location;
	@NotNull
	@Min(value=5, message="Phone number can't be less than 5 digit")
	private Integer phone;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	/*Parameterized constructor to get value once prevent use of setter methods*/
	public Friend(String name, String email, String location, Integer phone) {
		this.name = name;
		this.email = email;
		this.location = location;
		this.phone = phone;
	}
	public Friend() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
