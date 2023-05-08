package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.AdministradorActividadesBBDD;
import ModeloDTA.AdministradorClientesBBDD;
import ModeloDTA.AdministradorHabitacionesBBDD;
import ModeloDTO.Actividades;
import ModeloDTO.Clientes;
import ModeloDTO.Habitaciones;

/**
 * Servlet implementation class Administracion
 */
@WebServlet("/Administracion")
public class Administracion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Administracion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		AdministradorClientesBBDD basedatos = new AdministradorClientesBBDD();
		AdministradorActividadesBBDD actividadescreadas = new AdministradorActividadesBBDD();
		AdministradorHabitacionesBBDD habitaciones= new AdministradorHabitacionesBBDD();
		
		ArrayList<Clientes> clientes = new ArrayList<Clientes>();
		ArrayList<Actividades> actividadescreadas1 = new ArrayList<Actividades>();
		ArrayList<Habitaciones> habitaciones1 = new ArrayList<Habitaciones>();
		
		
		try {
			clientes= basedatos.getClientes();
			actividadescreadas1= actividadescreadas.getActividades();
			habitaciones1= habitaciones.gethabitaciones();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		request.setAttribute("habitaciones1", habitaciones1);
		request.setAttribute("actividadescreadas1", actividadescreadas1);
		request.setAttribute("clientes", clientes);
		request.getRequestDispatcher("Administracion.jsp").forward(request,response);

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
