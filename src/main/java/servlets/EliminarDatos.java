package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.AdministradorActividadesBBDD;
import ModeloDTA.AdministradorClientesBBDD;
import ModeloDTA.AdministradorHabitacionesBBDD;

/**
 * Servlet implementation class EliminarClientes
 */
@WebServlet("/EliminarDatos")
public class EliminarDatos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EliminarDatos() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String tipo = request.getParameter("tipo");
		AdministradorClientesBBDD adminClientes = new AdministradorClientesBBDD();
		AdministradorActividadesBBDD adminActividades = new AdministradorActividadesBBDD();
		AdministradorHabitacionesBBDD habitaciones= new AdministradorHabitacionesBBDD();
		
	
		
		try {
			switch(tipo) {
			case "cliente":
				adminClientes.bajaUsuario(id);
				break;
			case "actividad":
				adminActividades.EliminarActividad(id);
				break;
			case "habitaciones":
				habitaciones.EliminarHabitacion(id);
				break;
			}
		} catch (Exception e) {
		}
		response.sendRedirect(request.getContextPath()+"/Administracion");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
