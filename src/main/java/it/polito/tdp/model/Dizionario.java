package it.polito.tdp.model;

import java.util.HashMap;
import java.util.Set;

public class Dizionario {

	// Scelgo una mappa per la struttura dati
	HashMap<String, Parola> mappaParole;
	
	public Dizionario() {
		this.mappaParole = new HashMap<>(); 
	}
	
	/**
	 * Aggiunge un oggetto Parola alla base dati, una mappa
	 * Non fa ancora il controllo sul fatto che esista già la stessa parola
	 * @param parAliena: la stringa del nome della parolaAliena
	 * @param traduzione: la stringa della sua traduzione
	 */
	public void addTraduzione(String parAliena, String traduzione) {
		Parola p = this.mappaParole.get(parAliena);
		if(p!=null) {
			p.aggiungiTraduzione(traduzione);
		}
		else {
			p = new Parola(parAliena);
			p.aggiungiTraduzione(traduzione);
			this.mappaParole.put(parAliena, p);
		}		
		
	}
	
	/**
	 * Rimanda lE traduzionI della parola aliena cercata
	 * 
	 * @param parAliena: la parola aliena di cui voglio sapere la traduzione
	 * @return la traduzione se presente oppure un avviso (sarebbe meglio scatenare un'eccezione)
	 */
	public Set<String> cercaTraduzioni(String parAliena) {
		Parola p = this.mappaParole.get(parAliena);
		if(p!=null) {
			return p.getTraduzioni();
		}
		
		// al posto di questo valore di ritorno potrei catenare un'eccezione
		return null;
	}
}
