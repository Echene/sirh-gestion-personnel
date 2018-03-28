package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Emmanuel
 *
 */
public class EditerCollaborateursController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recupere la valeur d'un parametre dont le nom est avecPhoto
		String matricule = req.getParameter("matricule");

		resp.setContentType("text/html");

		if (matricule == null) {
			resp.sendError(400, "Un matricule est attendu");
		} else {
			// code HTML ecrit dans le corps de la reponse
			resp.getWriter().write("<h1>Edition d'un collaborateur</h1><h2>Matricule : " + matricule + "</h2>" + "<ul>" + 
			"<li>POST /collaborateurs/editer</li>" +
					"<ul><li>La servlet vérifie que les parametres suivants sont renseignes : </li>" +
						"<ul>"
							+ "<li>Matricule,</li>"
							+ "<li>Titre,</li>"
							+ "<li>Nom,</li>"
							+ "<li>Prenom</li>"
					+ "</ul>"	
					+ "</ul>"
					+ "</ul>");
		}

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recupere la valeur d'un parametre dont le nom est avecPhoto
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");

		resp.setContentType("text/html");

		String manquant = "";

		boolean OK = true;

		if (matricule == null) {
			OK = false;
			manquant += "matricule ";
		}

		if (titre == null) {
			OK = false;
			manquant += "titre ";
		}
		if (nom == null) {
			OK = false;
			manquant += "nom ";
		}
		if (prenom == null) {
			OK = false;
			manquant += "prenom ";
		}

		if (OK) {
			
			// code HTML ecrit dans le corps de la reponse
			resp.getWriter()
					.write("<h1>Ajout d'un collaborateur</h1><h2>Matricule : " + matricule + "</h2>" + "<ul>"
							+ "<li>POST /collaborateurs/editer</li>"
							+ "<ul><li>La servlet vérifie que les parametres suivants sont renseignes : </li>" + "<ul>"
							+ "<li>Matricule : " + matricule + "</li>" + "<li>Titre : " + titre + "</li>" + "<li>Nom : " + nom + "</li>" + "<li>Prenom : " + prenom + "</li>" + "</ul>"
							+ "</ul>" + "</ul>");
			
		} else {
			
			resp.sendError(400, "Les paramètres suivants sont incorrects :" + manquant);
			
		}

	}

}
