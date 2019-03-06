package les.concepteurs.fooder.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import les.concepteurs.fooder.dao.DAOConnect;

/**
 * Servlet implementation class testServlet
 */
public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Servi ->: ").append(request.getContextPath());
		
		

		try {
			ResultSet result = DAOConnect.getConnexion().createStatement().executeQuery("SELECT DISTINCT I.ID_ING, I.ID_RAYON, I.NOM_ING, I.PHOTO_ING, R.NOM as NOM_RAYON "
					+ "FROM INGREDIENT I, RAYON R "
					+ "WHERE I.ID_ING = 2 "
					+ "  AND R.ID_RAYON = I.ID_RAYON");
			
			ResultSetMetaData resultMeta = result.getMetaData();
		     
		    while(result.next())
		    {          
		        for(int i = 1; i <=  resultMeta.getColumnCount(); i++)
		            System.out.print(result.getObject(i).toString());  
		    }
		    result.close();
		        
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
//		try {
//		
//			recette = recetteDAO.find(2);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		response.setContentType("text/html") ;
		
		PrintWriter out = response.getWriter() ;
		out.println("<html>") ;
		out.println("<head>") ;
		out.println("<title>Bonjour le monde !</title>") ;
		out.println("</head>") ;
		out.println("<body>") ;
		out.println("<h1>-"+"-</h1>") ;
		out.println("</body>") ;
		out.println("</html>") ;   
		
		
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
