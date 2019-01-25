package orm_support.association_ex.xml_based;

import java.util.Set;

public class Courses {
	private int cid;
	private String cname;
	private int cfee;
	private Set<Faculty> faculties;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCfee() {
		return cfee;
	}
	public void setCfee(int cfee) {
		this.cfee = cfee;
	}
	public Set<Faculty> getFaculties() {
		return faculties;
	}
	public void setFaculties(Set<Faculty> faculties) {
		this.faculties = faculties;
	}
	
	public Courses() {
		// TODO Auto-generated constructor stub
	}
	public Courses(int cid, String cname, int cfee) {
		this.cid = cid;
		this.cname = cname;
		this.cfee = cfee;
	}
	
}
