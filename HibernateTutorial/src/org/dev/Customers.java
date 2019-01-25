package org.dev;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="customers")
@Table(name="customers")
public class Customers implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private int phone;
	

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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public Customers(){}
	
	public Customers(String name,String email, int phone){
		this.name=name;
		this.email=email;
		this.phone=phone;
	}
	
	
}
