package les.concepteurs.fooder.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import les.concepteurs.fooder.dao.DAOConnect;
import les.concepteurs.fooder.implement.IngredientDAO;
import les.concepteurs.fooder.metier.Ingredient;

/**
 * Servlet implementation class ListeRecettes
 */
public class ListeRecettes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeRecettes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
	    response.setCharacterEncoding( "UTF-8" );
	    PrintWriter out = response.getWriter();
		methodeTest(out);
		
		
	}

	private void methodeTest(PrintWriter out) {
		Ingredient ing = null;
		
		try {
			 ing = new IngredientDAO(DAOConnect.getConnexion()).find(3);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"utf-8\" />");
	    out.println("<title>Test</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>Page de test</h1>");
	    out.println("<h2>ServLet utilisée : testServLet</h2>");
	    out.println("<p><b>Object from DAO (toString) :</b><br/><br /> "+ing+"</p>");
	    out.println("</body>");
	    out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
