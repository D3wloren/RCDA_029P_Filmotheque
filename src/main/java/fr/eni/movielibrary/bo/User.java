package fr.eni.movielibrary.bo;

import java.util.List;

public class User {

	//Variables
	protected long id;
	protected String lastname;
	protected String firstname;
	protected String login;
	protected String password;
	protected boolean isAdmin;
	
	//Relations
	protected List<Review> reviews;
	
	/**
	 * Constructor
	 * @param id
	 * @param lastname
	 * @param firstname
	 * @param login
	 * @param password
	 * @param isAdmin
	 */
	public User(long id, String lastname, String firstname, String login, String password, boolean isAdmin) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.login = login;
		this.password = password;
		this.isAdmin = isAdmin;
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
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the isAdmin
	 */
	public boolean isAdmin() {
		return isAdmin;
	}

	/**
	 * @param isAdmin the isAdmin to set
	 */
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
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
	
}
