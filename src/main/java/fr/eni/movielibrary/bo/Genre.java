package fr.eni.movielibrary.bo;

public class Genre {

	//Variables
	protected int id;
	protected String label;
	
	/**
	 * Constructor
	 * @param id
	 * @param label
	 */
	public Genre(int id, String label) {
		super();
		this.id = id;
		this.label = label;
	}
	
	//Getters & Setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
}
