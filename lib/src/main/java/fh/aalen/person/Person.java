package fh.aalen.person;
import java.util.List;

import fh.aalen.video.Video;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="person")

public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
		@Column(name = "surename")
	 private String surename;
		@Column(name = "birthdate")
	 private String birthdate;
	
		@ManyToMany
		private List<Video> favouriteVideos;
		public Person(){} //When missing, problems may occur with jpa?
		public Person(int id, String surename, String birthdate) {
		super();
		this.id = id;
		this.surename = surename;
		this.birthdate = birthdate;
		}
		//Relationship N-to-M --> favours
		public List<Video> getFavouriteVideos() {
		return favouriteVideos;
		}
		public void addVideoToFavorites(Video v) {
		this.favouriteVideos.add(v);
		}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSurename() {
		return surename;
	}
	public void setSurename(String surename) {
		this.surename = surename;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	 
	 
	}

