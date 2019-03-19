package les.concepteurs.fooder.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import les.concepteurs.fooder.metier.ListeRecettes;
import les.concepteurs.fooder.metier.Recette;
import les.concepteurs.fooder.service.ServiceRecette;
import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher;

/**
 * Servlet implementation class Hello
 */
@WebServlet (
		name = "Hello",
		urlPatterns = {"/hello"}
		)
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// controle console
		System.out.println("dans le doGet de servlet Hello");

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ServiceRecette servRec = new ServiceRecette();
		
		ListeRecettes listeRec = servRec.recupListeRecettes(2);
		
		request.setAttribute("listeRecette", listeRec);
		
		//set du request
		request.setAttribute("listeRecettes", listeRec);
				
		//renvoi vers la jsp d'accueilRecettes
		RequestDispatcher disp = request.getRequestDispatcher("/vue/accueilRecettes.jsp");
		disp.forward(request, response);
		
//		PrintWriter out = response.getWriter() ;
//		
//		response.setContentType( "text/html");
//		out.println("<html><head></head><body>");
//		out.println("<br>");
//		out.println("Vous êtes sur Hello");
//			
//		out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
