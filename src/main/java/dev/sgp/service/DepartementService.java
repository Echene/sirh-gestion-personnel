/**
 * 
 */
package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Departement;

/**
 * @author Emmanuel
 *
 */
public class DepartementService {

	static List<Departement> listeDepartements = new ArrayList<>();
	
	public DepartementService() {
		
		if(listeDepartements.size() == 0) {
			listeDepartements.add(new Departement("Informatique"));
			listeDepartements.add(new Departement("Comptabilité"));
			listeDepartements.add(new Departement("Ressources humaines"));
		}

	}
	
	public List<Departement> listerDepartements() {
		return listeDepartements;
	}
}
