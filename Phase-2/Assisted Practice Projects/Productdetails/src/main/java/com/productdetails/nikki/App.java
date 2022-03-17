package com.productdetails.nikki;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/App")
public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pId = request.getParameter("productId");
		String pName = request.getParameter("productName");
		String pPrice = request.getParameter("productPrice");
		HttpSession theSession = request.getSession();
		theSession.setAttribute("pid", pId);
		theSession.setAttribute("pname", pName);
		theSession.setAttribute("pprice", pPrice);
		response.sendRedirect("product.jsp");
		}
}