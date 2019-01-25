package orm_support.association_ex.annotation_based;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="actor")
@Table(name="actor")
public class Actor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="aid")
	private int aid;
	@Column(name="name")
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
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="movies", joinColumns={@JoinColumn(name="aid")}, inverseJoinColumns={@JoinColumn(name="mid")})
	public void setMovies(Collection<Movie> movies) {
		this.movies = movies;
	}
	
	
	
}
