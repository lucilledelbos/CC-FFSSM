package FFSSM;
import java.time.LocalDate;
import java.util.ArrayList;

public class Plongeur extends Personne{
	private int niveau;
	ArrayList<Licence> lesLicences = new ArrayList<Licence>();
	private GroupeSanguin groupe;
	
	public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
		
	}
	
	public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance, int niveau) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
		this.niveau=niveau;
	}
	
	public void ajouteLicence(String numero, LocalDate delivrance, Club c) {
		Licence licence = new Licence(this, numero, delivrance, c);
		lesLicences.add(licence);
	}
	public Licence derniereLicence() {
		return lesLicences.get(lesLicences.size()-1);
	}

	public ArrayList<Licence> getLesLicences() {
		return lesLicences;
	}

	public void setLesLicences(ArrayList<Licence> lesLicences) {
		this.lesLicences = lesLicences;
	}
	
}
