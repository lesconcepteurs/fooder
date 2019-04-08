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
	 * Methode doGet qui recupere l'url (A partir du chemin relatif a la servlet, 
	 * cad le chemin apres l'urlPattern de la servlet)
	 * et redirige vers une sous servlet selon le path.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String path = request.getPathInfo();

		System.out.println("Dans le doGet de la servlet Controleur de facade.");
		System.out.println("Context path= "+ request.getContextPath());
		System.out.println("Path= "+path);

		if (path == null || path.equals("/")) {	
			doAccueilRecette(request, response);
		}
		else if (path.equals("/Entrees"))	{
			doEntrees(request, response);
		}
		else if (path.equals("/Plats")) {
			doPlats(request, response);
		}
		else if (path.equals("/Desserts")) {
			doDesserts(request, response);
		}
		else 		{								                    

		}

		System.out.println("fin du doGet de la servlet Controleur facade");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * Methode qui renvoie vers la servlet AccueilRecette
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void doAccueilRecette(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dans doAccueilRecette");

		String path = request.getPathInfo();
		//On ajoute au path l'urlPattern de la servlet cible
		path = path + "accueilRecette";

		System.out.println("path : " + path);

		disp = request.getRequestDispatcher(path);
		disp.forward(request, response);

	}

	/**
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void doEntrees(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doEntrees");
		String path = request.getContextPath() + "/Entrees/";
		System.out.println("context path Entrees : " +path);
		System.out.println("contexte path info : "+ request.getPathInfo());
		disp = request.getRequestDispatcher(request.getPathInfo());
		disp.forward(request, response);

	}

	private void doPlats(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPlats");
		String path = request.getContextPath() + "/Plats/";
		System.out.println("context path Plats : " +path);
		System.out.println("contexte path info : "+ request.getPathInfo());
		disp = request.getRequestDispatcher(request.getPathInfo());
		disp.forward(request, response);

	}

	private void doDesserts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doDesserts");
		String path = request.getContextPath() + "/Desserts/";
		System.out.println("context path Entrees : " +path);
		System.out.println("contexte path info : "+ request.getPathInfo());
		disp = request.getRequestDispatcher(request.getPathInfo());
		disp.forward(request, response);

	}

}
