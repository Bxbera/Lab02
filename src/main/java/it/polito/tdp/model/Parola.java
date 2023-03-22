package it.polito.tdp.model;

import java.util.HashSet;

public class Parola {

	String parolaAliena;
	HashSet<String> traduzioni;
	//String traduzione;
	
	public Parola(String parolaAliena) {
		this.parolaAliena = parolaAliena;
		this.traduzioni = new HashSet<>();
	}

	public String getParolaAliena() {
		return parolaAliena;
	}

	public HashSet<String> getTraduzioni() {
		return traduzioni;
	}
	
	/**
	 * Aggiunge una parola all'insieme di traduzioni della parola aliena
	 * @param word, la traduzione della parola
	 * @return true, se aggiunge la parola, false, se non la aggiunge, perchè è già presente (è case sensitive però)
	 */	
	public boolean aggiungiTraduzione(String word) {
		if(! this.traduzioni.contains(word)) {
			this.traduzioni.add(word) ;
			return true;
		}
		
		return false;
	}
	
	
}
