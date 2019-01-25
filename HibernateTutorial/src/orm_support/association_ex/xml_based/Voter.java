package orm_support.association_ex.xml_based;

public class Voter {
	private int vid;
	private String name;
	private int age;
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
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
	public Voter(int vid, String name, int age) {
		this.vid = vid;
		this.name = name;
		this.age = age;
	}
	public Voter() {
		// TODO Auto-generated constructor stub
	}
}
