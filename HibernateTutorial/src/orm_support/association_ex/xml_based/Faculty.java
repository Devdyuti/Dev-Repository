package orm_support.association_ex.xml_based;

import java.util.Set;

public class Faculty {
	private int fid;
	private String fname;
	private int yearex;
	private Set<Courses> courses;
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getYearex() {
		return yearex;
	}
	public void setYearex(int yearex) {
		this.yearex = yearex;
	}
	public Set<Courses> getCourses() {
		return courses;
	}
	public void setCourses(Set<Courses> courses) {
		this.courses = courses;
	}
	public Faculty() {
		// TODO Auto-generated constructor stub
	}
	public Faculty(int fid, String fname, int yearex) {
		this.fid = fid;
		this.fname = fname;
		this.yearex = yearex;
	}
	
	
}
