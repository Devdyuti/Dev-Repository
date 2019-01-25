package orm_support.association_ex.xml_based;

import java.util.Collection;
import java.util.List;

public class Actor {
	
	private int aid;
	private String name;
	private Collection<Movie> movies;
	
	public Actor() {
	}
	public Actor(int aid, String name) {
		this.aid = aid;
		this.name = name;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<Movie> getMovies() {
		return movies;
	}
	public void setMovies(Collection<Movie> movies) {
		this.movies = movies;
	}
	
	
	
}
