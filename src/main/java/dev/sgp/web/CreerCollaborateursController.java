package dev.sgp.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

/**
 * @author Emmanuel
 *
 */
public class CreerCollaborateursController extends HttpServlet {

	// Recuperation du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recupere la valeur d'un parametre dont le nom est avecPhoto
		String nom = req.getParameter("nomInput");
		String prenom = req.getParameter("prenomInput");
		String dateDeNaissance = req.getParameter("dateDeNaissanceInput");
		String adresse = req.getParameter("adresseInput");
		String numeroSecuriteSociale = req.getParameter("numeroSecuriteSocialeInput");

		boolean Ok = true;
		String incorrect = "";

		if (nom == null) {
			Ok = false;
			incorrect = "nom ";
		}
		if (prenom == null) {
			Ok = false;
			incorrect += "prenom ";
		}
		if (dateDeNaissance == null) {
			Ok = false;
			incorrect += "date de naissance ";
		}
		if (adresse == null) {
			Ok = false;
			incorrect += "adresse ";
		}
		if (numeroSecuriteSociale == null) {
			Ok = false;
			incorrect += "numéro de sécurité sociale ";
		}

		if (Ok) {

			Collaborateur collaborateur = new Collaborateur(nom, prenom, dateDeNaissance, adresse,
					numeroSecuriteSociale);

			CollaborateurService.sauvegarderCollaborateur(collaborateur);

			req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);

		} else {

			resp.sendError(400, "Les paramètres suivants sont incorrects : " + incorrect);

		}
	}
}
