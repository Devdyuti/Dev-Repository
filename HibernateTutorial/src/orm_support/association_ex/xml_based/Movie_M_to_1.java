package orm_support.association_ex.xml_based;

public class Movie_M_to_1 {
	
	private int mid;
	private String moviename;
	private Actor_M_to_1 actor;
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public Actor_M_to_1 getActor() {
		return actor;
	}
	public void setActor(Actor_M_to_1 actor) {
		this.actor = actor;
	}
	public Movie_M_to_1(int mid, String moviename) {
		this.mid = mid;
		this.moviename = moviename;
	}
	public Movie_M_to_1() {
		// TODO Auto-generated constructor stub
	}
	
	

}
