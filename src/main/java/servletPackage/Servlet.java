package servletPackage;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servletPackage.Shows;
import servletPackage.ShowWeek;
/*
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Shows myData;
	private String allshows;
	private String showAdd;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		myData = new Shows ("allData","./servletPackage/netflixAllWeeksGlobalProcessed.txt");
		allshows = "<select name=\"genres\">";
		allshows+= myData.toString();
		allshows += "</select>";
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		request.setAttribute("username",username); 
		request.setAttribute("password", password);

		//Index Button
		if(request.getParameter("indexButton")!=null) {
			if(username.equals("md") && password.equals("pw")) {
				request.setAttribute("DropdownData", allshows);
				RequestDispatcher rd =request.getRequestDispatcher("/showMenu.jsp");
				rd.forward(request,response);
			} else {
				RequestDispatcher rd =request.getRequestDispatcher("/index.html");
				rd.forward(request,response);
			}
		}

		//Menu Add Show Button
		else if(request.getParameter("add")!=null) {
			RequestDispatcher rd =request.getRequestDispatcher("/addShows.jsp");
			rd.forward(request, response);
		}

		//Menu Show DropDown Button
		else if(request.getParameter("display")!=null) {
			request.setAttribute("DropdownData", allshows);
			RequestDispatcher rd=request.getRequestDispatcher("/mainShows.jsp");
			rd.forward(request,response);
		}

		//Add show to dropdown button
		else if(request.getParameter("addShowButton")!=null) {
			showAdd = request.getParameter("addShow");
			allshows = "<select name=\"genres\">";
			allshows+= myData.toString();
			allshows+=  "<option value=\"" + showAdd + "\">" + showAdd + "</option>";
			allshows+= "</select>";

			request.setAttribute("DropdownData", allshows);
			RequestDispatcher rd =request.getRequestDispatcher("/mainShows.jsp");
			rd.forward(request,response);
		}

		//return to main menu
		else if(request.getParameter("returnShowButton")!=null) {
			RequestDispatcher rd =request.getRequestDispatcher("/showMenu.jsp");
			rd.forward(request,response);
		}
		
		//Logout
		else if(request.getParameter("logout")!=null) {
			RequestDispatcher rd =request.getRequestDispatcher("/index.html");
			rd.forward(request,response);
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
