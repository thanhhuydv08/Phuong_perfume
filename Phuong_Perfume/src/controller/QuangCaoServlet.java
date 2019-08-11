package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.QuangCao;
import model.QuangCaoBL;

/**
 * Servlet implementation class QuangCaoServlet
 */
@WebServlet("/QuangCaoServlet")
public class QuangCaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     ArrayList<QuangCao>   lsqc = new ArrayList<QuangCao>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuangCaoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		QuangCaoBL quangCaoBL = new QuangCaoBL();
		lsqc = quangCaoBL.DocTatCa();
		
		request.setAttribute("lsqc", lsqc);
		request.getRequestDispatcher("views/quang-cao.jsp").include(request, response); // tại sao không forward  như các bt khác
		 // vi trang jsp quang cao la 1 phan cua trang chu  vi vay ta chi include thoi .
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
