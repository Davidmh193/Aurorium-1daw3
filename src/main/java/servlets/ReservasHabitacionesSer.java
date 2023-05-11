package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.ReservasBBDD;

/**
 * Servlet implementation class ReservasAdministracion
 */
@WebServlet("/ReservasHabitacionesSer")
public class ReservasHabitacionesSer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReservasHabitacionesSer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ReservasBBDD HotelesReserva = new ReservasBBDD();

		String habitacionesId = request.getParameter("Habitaciones");
		String dni = request.getParameter("dni");

		String Entrada = request.getParameter("Entrada");
		String Salida = request.getParameter("Salida");
		java.util.Date entrafecha = null;
		java.util.Date Salidafecha = null;

		try {
			entrafecha = new SimpleDateFormat("yyyy-MM-dd").parse(Entrada);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			Salidafecha = new SimpleDateFormat("yyyy-MM-dd").parse(Salida);
		} catch (ParseException e1) {
			e1.printStackTrace();

		}
		try {
			
			HotelesReserva.modificarHabitaciones(habitacionesId, entrafecha, Salidafecha, dni);
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		request.getRequestDispatcher("/ReservasAdministracionSer").forward(request, response);
	}
}
