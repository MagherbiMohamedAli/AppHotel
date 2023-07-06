package tn.essat.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essat.dao.ChambreImp;
import tn.essat.dao.IChambre;
import tn.essat.model.Chambre;

/**
 * Servlet implementation class AddCh
 */
public class AddCh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCh() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titre=request.getParameter("titre");
		String type=request.getParameter("type");
		float prix= Float.parseFloat(request.getParameter("prix"));
		
		IChambre daoch= new ChambreImp();
		daoch.addChambre(new Chambre(titre, type, prix));
		request.getRequestDispatcher("ChargeChambres").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
