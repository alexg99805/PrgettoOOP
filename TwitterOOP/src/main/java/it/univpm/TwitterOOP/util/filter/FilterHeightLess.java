package it.univpm.TwitterOOP.util.filter;

import it.univpm.TwitterOOP.model.Tweet;
import it.univpm.TwitterOOP.util.other.Filter;
import it.univpm.TwitterOOP.util.other.IntegerCheck;

/**
 * Questa classe controlla se l'immagine contenuta nel tweet che gli viene
 * passato ha un'altezza minore di un parametro che gli viene passato
 * 
 * @see Tweet
 * @see IntegerCheck
 * @see Filter
 * 
 * @author Davide Pacioni
 * @author Alex Giaccio
 */
public class FilterHeightLess extends IntegerCheck implements Filter {

	public FilterHeightLess(Object paramFilter) {
		super(paramFilter);
	}

	@Override
	public boolean filter(Tweet tweet) {
		for (int i = 0; i < tweet.getEntities().size(); i++)
			for (int j = 0; j < tweet.getEntities().get(i).getImages().size(); j++)
				for (int k = 0; k < tweet.getEntities().get(i).getImages().get(j).getSize().size(); k++) {
					if (tweet.getEntities().get(i).getImages().get(j).getSize().get(k).getHeight() < paramFilter)
						return true;
				}
		return false;

	}

}
