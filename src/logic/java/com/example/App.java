package com.example;


public class App {
	
	/*
	 * converte i gradi dal formato fahrenheit a quello celsius. 
	 * Chi sviluppa E ANCHE testa l'applicazione implementa la 
	 * formula in maniera errata, diversa da quella effettiva 
	 * CELSIUS = (FAHRENEIT - 32)*5/9,
	 *  per cui quando farà i test cases risulteranno non esserci errori 
	 *  o failures, ma semplicemente perché la formula è errata 
	 *  e si sta aspettando risultati errati calcolati con una formula 
	 *  sbagliata.
	 */

	public double convertiInCelsius(double fahrenheit) {
		return (fahrenheit -35) *(5/9);
	}
}
