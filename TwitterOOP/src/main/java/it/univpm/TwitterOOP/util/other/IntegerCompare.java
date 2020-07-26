package it.univpm.TwitterOOP.util.other;

/**
 * Rappresenta la superclasse per i filtri che lavorano su intero.
 * 
 * @author Davide Pacioni
 * @author Alex Giaccio
 *
 */
public class IntegerCompare {

	protected int paramFilter;

	/**
	 * Costru
	 * 
	 * @param paramFilter deve essere tipo intero
	 * @throws IllegalArgumentException viene lanciata se viene inserito il tipo
	 *                                  sbagliato
	 */
	public IntegerCompare(Object paramFilter) {
		System.out.println(paramFilter);
		if (paramFilter instanceof Integer) {
			this.paramFilter = (Integer) paramFilter;
		} else {
			throw new IllegalArgumentException("Deve essere di tipo intero");
		}

	}

}
