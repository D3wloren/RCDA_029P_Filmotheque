package fr.eni.movielibrary.bo;

import java.util.List;

public class Movie {

	//Variables
	protected long id;
	protected String title;
	protected int releaseYear;
	protected int duration;
	protected String synopsis;
	
	//Relations
	protected Genre genre;
	protected List<Review> reviews;
	protected Participant director;
	protected List<Participant> actors;
	
	/**
	 * Constructor
	 * @param id
	 * @param title
	 * @param releaseYear
	 * @param duration
	 * @param synopsis
	 */
	public Movie(long id, String title, int releaseYear, int duration, String synopsis) {
		super();
		this.id = id;
		this.title = title;
		this.releaseYear = releaseYear;
		this.duration = duration;
		this.synopsis = synopsis;
	}
	
	@Override
	public String toString() {
		String directorString = String.format(" %s %s [id=%d]", director.firstname, director.lastname, director.id);
		
		String actorsString = "";
		for(Participant actor : actors) {
			actorsString += String.format("%s %s [id=%d], ", actor.firstname, actor.lastname, actor.id);
		}
		
		return String.format("Movie [id=%d] \nTitle: %s \nSynopsis: %s \nDirector: %s \nActors : %s \n", id, title, synopsis, directorString, actorsString);
	}
	
	//Getters & Setters
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the releaseYear
	 */
	public int getReleaseYear() {
		return releaseYear;
	}
	/**
	 * @param releaseYear the releaseYear to set
	 */
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	 * @return the synopsis
	 */
	public String getSynopsis() {
		return synopsis;
	}
	/**
	 * @param synopsis the synopsis to set
	 */
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	/**
	 * @return the genre
	 */
	public Genre getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	/**
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}
	/**
	 * @param reviews the reviews to set
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	/**
	 * @return the director
	 */
	public Participant getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(Participant director) {
		this.director = director;
	}
	/**
	 * @return the actors
	 */
	public List<Participant> getActors() {
		return actors;
	}
	/**
	 * @param actors the actors to set
	 */
	public void setActors(List<Participant> actors) {
		this.actors = actors;
	}
}
