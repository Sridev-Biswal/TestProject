package com.maren.demosecb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.demosecb.service.UtilClass;

/**
 * Servlet implementation class DispatcherController
 */
@WebServlet("/DispatcherController")
public class DispatcherController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("no");
		int x = Integer.parseInt(no);
		int rev = UtilClass.getReverse(x);
		
		request.getRequestDispatcher("/configCtrl").forward(request, response);
	}
}
