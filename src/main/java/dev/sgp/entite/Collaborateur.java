/**
 * 
 */
package dev.sgp.entite;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author Emmanuel
 *
 */
public class Collaborateur {

	/** matricule : String */
	private String matricule;

	/** nom : String */
	private String nom;

	/** nom : String */
	private String prenom;

	/** dateDeNaissance : LocalDate */
	private LocalDate dateDeNaissance;

	/** adresse : String */
	private String adresse;

	/** numeroSecuriteSociale : String */
	private String numeroSecuriteSociale;

	/** emailPro : String */
	private String emailPro;

	/** photo : String */
	private String photo;

	/** dateheureCreation : ZonedDateTime */
	private LocalDateTime dateHeureCreation;

	/** actif : boolean */
	private boolean actif;

	public Collaborateur() {
		// Constructeur vide
	}

	public Collaborateur(String unNom, String unPrenom, String uneDateDeNaissance, String uneAdresse,
			String unNumeroSecuriteSociale) {

		Random rnd = new Random();
		this.matricule = 100000 + rnd.nextInt(900000) + "";
		this.nom = unNom;
		this.prenom = unPrenom;
		this.dateDeNaissance = LocalDate.parse(uneDateDeNaissance);
		this.adresse = uneAdresse;
		this.numeroSecuriteSociale = unNumeroSecuriteSociale;
		this.emailPro = prenom + "." + nom + "@societe.com";
		this.photo = "cent_cent.png";
		this.dateHeureCreation = LocalDateTime.now();
		this.actif = true;

	}

	/**
	 * Getter
	 * 
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Getter
	 * 
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	/**
	 * Getter
	 * 
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Getter
	 * 
	 * @return the numeroSecuriteSociale
	 */
	public String getNumeroSecuriteSociale() {
		return numeroSecuriteSociale;
	}

	/**
	 * Getter
	 * 
	 * @return the emailPro
	 */
	public String getEmailPro() {
		return emailPro;
	}

	/**
	 * Getter
	 * 
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * Getter
	 * 
	 * @return the dateheureCreation
	 */
	public LocalDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	/**
	 * Getter
	 * 
	 * @return the actif
	 */
	public boolean isActif() {
		return actif;
	}

	/**
	 * Setter
	 * 
	 * @param matricule
	 *            the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter
	 * 
	 * @param dateDeNaissance
	 *            the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	/**
	 * Setter
	 * 
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Setter
	 * 
	 * @param numeroSecuriteSociale
	 *            the numeroSecuriteSociale to set
	 */
	public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
		this.numeroSecuriteSociale = numeroSecuriteSociale;
	}

	/**
	 * Setter
	 * 
	 * @param emailPro
	 *            the emailPro to set
	 */
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	/**
	 * Setter
	 * 
	 * @param photo
	 *            the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * Setter
	 * 
	 * @param dateheureCreation
	 *            the dateheureCreation to set
	 */
	public void setDateHeureCreation(LocalDateTime dateheureCreation) {
		this.dateHeureCreation = dateheureCreation;
	}

	/**
	 * Setter
	 * 
	 * @param actif
	 *            the actif to set
	 */
	public void setActif(boolean actif) {
		this.actif = actif;
	}

	/**
	 * Setter
	 * 
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
