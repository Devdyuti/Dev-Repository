package orm_support.association_ex.annotation_based;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity(name="movie")
@Table(name="movie")
public class Movie implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mid")
	private int mid;
	@Column(name="movie")
	private String movie;
	@Column(name="aid")
	@PrimaryKeyJoinColumn(name="aid")
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
