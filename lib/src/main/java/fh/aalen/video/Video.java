package fh.aalen.video;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import fh.aalen.person.Person;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="video")
public class Video {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)

 private String title;
	@Column(name = "age_rating")
 private int age_rating;
	@Column(name = "desricption")
 private String description;
	@Column(name = "genre")
 private String genre;
	@ManyToMany(mappedBy="favouriteVideos")
	@JsonIgnore //Otherwise problems with recursion in json video-->person-->video-->...
	private List<Person> personFavourites;
 
public Video() {
	super();
}
public Video(String title, int age_rating, String description, String genre) {
	super();
	this.title = title;
	this.age_rating = age_rating;
	this.description = description;
	this.genre = genre;
}
public List<Person> getPersonFavourites() {
return personFavourites;
}
public void setPersonFavourites(List<Person> personFavourites) {
this.personFavourites = personFavourites;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getAge_rating() {
	return age_rating;
}
public void setAge_rating(int age_rating) {
	this.age_rating = age_rating;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
 
 
}
