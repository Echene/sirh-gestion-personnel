package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

/**
 * @author Emmanuel
 *
 */
public class ListerCollaborateursController extends HttpServlet {

	// recuperation du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// utilisation du service
		// List<Collaborateur> collaborateurs =
		// collabService.listerCollaborateurs();

		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String departement = req.getParameter("departementInput");

		req.setAttribute("filter", departement);
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);

	}
}