/**
 * @(#) Plongee.java
 */
package FFSSM;

import java.time.LocalDate;

import java.util.HashSet;
import java.util.Set;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Plongee {

	ArrayList<Plongeur> lesPlongeurs = new ArrayList<Plongeur>();
	private Site lieu;
	private Moniteur chefDePalanquee;
	private LocalDate date;
	private int profondeur;
	private int duree;

	public Plongee(Site lieu, Moniteur chefDePalanquee, LocalDate date, int profondeur, int duree) {
		this.lieu = lieu;
		this.chefDePalanquee = chefDePalanquee;
		this.date = date;
		this.profondeur = profondeur;
		this.duree = duree;
	}

	public void ajouteParticipant(Plongeur participant) {
		lesPlongeurs.add(participant);
	}

	public LocalDate getDate() {
		return date;
	}

	/**
	 * Détermine si la plongée est conforme. 
	 * Une plongée est conforme si tous les plongeurs de la palanquée ont une
	 * licence valide à la date de la plongée
	 * @return vrai si la plongée est conforme
	 */
	public boolean estConforme() {
		int b =0;
		boolean test = true;
		for (Plongeur p : lesPlongeurs) {
			if (p.derniereLicence().estValide(date)!=true) {
				b=1;
			}
		}
		if (b!=0) {
			test=false;
		} return test;
	}

}
