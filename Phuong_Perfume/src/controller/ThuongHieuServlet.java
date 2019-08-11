package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.QuangCaoBL;
import model.ThuongHieu;
import model.ThuongHieuBL;

/**
 * Servlet implementation class ThuongHieuServlet
 */
@WebServlet("/ThuongHieuServlet")
public class ThuongHieuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ArrayList< ThuongHieu> lsth = new ArrayList<ThuongHieu>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThuongHieuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ThuongHieuBL thuongHieuBL = new ThuongHieuBL();
		lsth = thuongHieuBL.DocTatCa();
		System.out.println(lsth.size());
		request.setAttribute("lsth", lsth);
		request.getRequestDispatcher("views/thuong-hieu.jsp").include(request, response); // tại sao không forward  như các bt khác
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
