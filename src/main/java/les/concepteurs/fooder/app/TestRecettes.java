package les.concepteurs.fooder.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import les.concepteurs.fooder.implement.RayonDAO;
import les.concepteurs.fooder.metier.Ingredient;
import les.concepteurs.fooder.metier.Rayon;
import les.concepteurs.fooder.service.ServiceIngredient;
import les.concepteurs.fooder.service.ServiceRayon;

/**
 * Servlet implementation class ListeRecettes
 */
public class TestRecettes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestRecettes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		Description desc1 = new Description(1, 2, "djhldsqjhf");
//		Description desc2 = new Description(2, 2, "iuytituy");
//		Description desc3 = new Description(3, 2, "5354qds");
//		
//		ListeDescriptionsRecette ldr = new ListeDescriptionsRecette();
//		ldr.add(desc1);
//		ldr.add(desc2);
//		ldr.add(desc3);
//		
//		for (Description desc : ldr) {
//			System.out.println(desc);
//		}
		
		response.setContentType("text/html");
	    response.setCharacterEncoding( "UTF-8" );
	    PrintWriter out = response.getWriter();
		methodeTest(out);
		
		
	}

	private void methodeTest(PrintWriter out) {
		
		System.out.println("*****************");
		System.out.println("*****************");
//		Recette recette = null;
//		
//		try {
//			recette = new RecetteDAO(DAOConnect.getConnexion()).find(1);
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//		out.println("<!DOCTYPE html>");
//	    out.println("<html>");
//	    out.println("<head>");
//	    out.println("<meta charset=\"utf-8\" />");
//	    out.println("<title>Test</title>");
//	    out.println("</head>");
//	    out.println("<body>");
//	    out.println("<h1>Page de test</h1>");
//	    out.println("<h2>ServLet utilisée : testServLet</h2>");
//	    out.println("<p><b>Object from DAO (toString) :</b><br/><br /> "+recette+"</p>");
//	    out.println("</body>");
//	    out.println("</html>");
		
//		RayonDAO rayonDAO = new RayonDAO();
//
//        Rayon rayon = new Rayon(0, "test Lundi 2");
//
//        rayonDAO.saveRayon(rayon);
		

//		ServiceRayon serviceRayon = new ServiceRayon();
//		Rayon rayon1 = serviceRayon.findById("1");
//		System.out.println(rayon1);
		
		ServiceIngredient serviceIngredient = new ServiceIngredient();
		Ingredient ingredient = serviceIngredient.findById(1);
		System.out.println(ingredient);
		System.out.println("Nom du rayon :" + ingredient.getRayon().getNomRayon());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
