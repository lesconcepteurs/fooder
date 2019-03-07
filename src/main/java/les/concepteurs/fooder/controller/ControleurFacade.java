package les.concepteurs.fooder.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet qui sert de controleur de facade et redispatche sur d'autres servlet de fonctionnalite.
 * @author stag05
 * 
 */
@WebServlet(
		name = "CtrlFacade", 
		description = "Controleur Facade", 
		urlPatterns = {"/facade/*"}
		)

public class ControleurFacade extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private RequestDispatcher disp;
	
	/**
	 * Methode qui va recuperer l'url (A� partir du chemin relatif A� la servlet, 
	 * cad le chemin apres l'urlPattern de la servlet)
	 * et rediriger vers une autre servlet en fonction du path.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getPathInfo();
		
		System.out.println("Je suis dans le Controleur de facade. Path= "+path);
		System.out.println("Je suis dans le Controleur de facade. Contexte path= "+ request.getContextPath());
		
		if (path == null || path.equals("/"))		doAccueil(request, response);
		else if (path.equals("/listeRecettes"))		doListeRecettes(request, response);
		else {
			doAccueil(request, response);
		}
		
	}


	/**
	 * Methode qui renvoie vers la page index.jsp
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void doAccueil(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		disp = request.getRequestDispatcher("/index.jsp");
		disp.forward(request, response);
		
	}
	
	/**
	 * Methode qui renvoie vers la page de liste des recettes
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void doListeRecettes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		disp = request.getRequestDispatcher("/ListeRecettes/");
		disp.forward(request, response);
		
	}
	
	
}