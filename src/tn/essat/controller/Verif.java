package tn.essat.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tn.essat.dao.IUser;
import tn.essat.dao.UserImp;
import tn.essat.model.User;

/**
 * Servlet implementation class Verif
 */
public class Verif extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Verif() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		
		String username=request.getParameter("login");
		String password=request.getParameter("password");
		IUser userdao= new UserImp();
		User u=userdao.verifUser(username, password);
		if(u==null) {
			session.setAttribute("erreur","Verifier vos parametres de connexion !");
			session.setAttribute("type","warning !");
			request.getRequestDispatcher("connexion.jsp").forward(request, response);
		}else {
			session.setAttribute("user", u);
			request.getRequestDispatcher("ChargeChambres").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
