package exam.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exam.models.Car;
import exam.models.Color;
import exam.services.RequeteService;

/**
 * Servlet implementation class ReportingServlet
 */
public class ReportingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequeteService requeteService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportingServlet() {
        super();
        this.requeteService = new RequeteService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Car> carsTen = new ArrayList<>();
		List<Car> carsMarque = new ArrayList<>();
		carsTen = this.requeteService.getLastTenCar();
		carsMarque = this.requeteService.getCountVoitureByMarque();		
		String nbCar = this.requeteService.countCar();
		
		if(carsTen == null || carsMarque == null) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
		else {
			request.setAttribute("carsTen", carsTen);
			request.setAttribute("carsMarque", carsMarque);
			request.setAttribute("nbCar", nbCar);
			
			request.getRequestDispatcher("reporting.jsp").forward(request, response);
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
