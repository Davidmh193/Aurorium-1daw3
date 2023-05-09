package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.ReservasBBDD;
import ModeloDTO.IncripcionesActividad;
import ModeloDTO.Reservas;

/**
 * Servlet implementation class ReservasAdministracionSer
 */
@WebServlet("/ReservasAdministracionSer")
public class ReservasAdministracionSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservasAdministracionSer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ReservasBBDD reservashabitacioness = new ReservasBBDD();
		ReservasBBDD Actividades = new ReservasBBDD();
		
		ArrayList<Reservas> reservashabitaciones = new ArrayList<Reservas>();
		ArrayList<IncripcionesActividad> actividadescreadas1 = new ArrayList<IncripcionesActividad>();
		
		try {
			reservashabitaciones= reservashabitacioness.getReservashabitaciones();
			actividadescreadas1= Actividades.getActividadesReserva();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		request.setAttribute("reservashabitaciones", reservashabitaciones);
		request.setAttribute("actividadescreadas1", actividadescreadas1);
		
		request.getRequestDispatcher("ReservasAdministracion.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
