package orm_support.association_ex.xml_based;

public class Actor_M_to_1 {
	private int aid;
	private String actorname;
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getActorname() {
		return actorname;
	}
	public void setActorname(String actorname) {
		this.actorname = actorname;
	}
	public Actor_M_to_1(int aid, String actorname) {
		this.aid = aid;
		this.actorname = actorname;
	}
	public Actor_M_to_1() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
