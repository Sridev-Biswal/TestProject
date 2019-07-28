package com.maren.demosecb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigController
 */
@WebServlet(
		urlPatterns = { "/configAction" }, 
		initParams = { 
				@WebInitParam(name = "University", value = "CUTM"), 
				@WebInitParam(name = "Branch", value = "CSE")
		})
public class ConfigController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String univ = getServletConfig().getInitParameter("University");
		String branch = getServletConfig().getInitParameter("Branch");
		response.getWriter().print("<b>University is : </b>" + univ +"<br/><b>Branch :</b>"+ branch);
	}

}
