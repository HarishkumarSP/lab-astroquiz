package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.EligibiltyCheck;


@WebServlet(urlPatterns= {"/eligiblemain"})
public class Eligibility extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response, String points) throws ServletException, IOException {


		EligibiltyCheck obj1=new EligibiltyCheck();

		boolean spaceEligible=obj1.checkQuizAnswer(points);
		
		
	String points1 =request.getParameter("points");
	
	
	if(false)
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/success.html");
		rd.forward(request, response);
	}
	else
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/fail.jsp");
		rd.forward(request, response);
		
	}

}
}
