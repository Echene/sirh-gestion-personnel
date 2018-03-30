/**
 * 
 */
package dev.sgp.entite;

/**
 * @author Emmanuel
 *
 */
public class Departement {

	/** id : int */
	private int id;
	
	/** nom : String */
	private String nom;
	
	private static int compteur = 1;
	
	public Departement() {
		// Constructeur vide
	}
	
	public Departement(String unNom) {
		this.nom = unNom;
		this.id = compteur;
		
		compteur += 1;
	}
	
	public Departement(Integer unId, String unNom) {
		this.id = unId;
		this.nom = unNom;
	}
	
	@Override
	public String toString() {
		return nom;
	}

	/** Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
