package les.concepteurs.fooder.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import les.concepteurs.fooder.metier.ListeRecettes;
import les.concepteurs.fooder.metier.Recette;
import les.concepteurs.fooder.service.ServiceRecette;

/**
 * Servlet implementation class AccueilRecette
 * Servlet qui s'occupe de recuperer la liste des recettes
 * puis renvoyer l'objet liste a la JSP de l'accueil
 */
@WebServlet (
		name = "AccueilRecette",
		urlPatterns = {"/accueilRecette"}
		)

public class AccueilRecette extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dans le doGet de la servlet AccueilRecette");
		System.out.println("path : " + request.getPathInfo());
		
		// création d'un objet ServiceRecette qui fera appel à ListeRecettesDAO
		ServiceRecette servRec = new ServiceRecette();
		/*ListeRecettes listeRecettes = null;
		listeRecettes = servRec.recupListeRecettes();*/ // avant hibernate
		
		List<Recette> listeRecettes = servRec.findAll();
		
		//controle 
		System.out.println(listeRecettes);
		
		//set du request
		request.setAttribute("listeRecettes", listeRecettes);
		
		//renvoi vers la jsp d'accueilRecettes
		RequestDispatcher disp = request.getRequestDispatcher("/vue/accueilRecettes.jsp");
		disp.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
