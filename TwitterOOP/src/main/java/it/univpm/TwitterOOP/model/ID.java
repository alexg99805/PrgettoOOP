package it.univpm.TwitterOOP.model;

/**
 * Questa classe viene adoperata come classe suprema dato che ha una sola
 * variabile che raffigura l'id e che è collettivo alla maggioranza delle classi
 * nel package model
 * 
 * @author Davide Pacioni
 * @author Alex Giaccio
 *
 */
public class ID {

	private long id;

	public ID() {
		super();
	}

	/**
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

}
