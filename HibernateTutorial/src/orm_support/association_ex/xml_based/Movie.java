package orm_support.association_ex.xml_based;

public class Movie {
	
	private int mid;
	private String movie;
	private int aid;
	
	
	
	public Movie(){
		
	}
	public Movie(int mid, String movie, int aid) {
		this.mid = mid;
		this.movie = movie;
		this.aid = aid;
	}
	public Movie(int mid, String movie) {
		this.mid = mid;
		this.movie = movie;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	
}
