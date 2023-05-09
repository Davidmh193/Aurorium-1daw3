package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.AdministradorActividadesBBDD;
import ModeloDTA.AdministradorClientesBBDD;

/**
 * Servlet implementation class EliminarClientes
 */
@WebServlet("/EliminarClientes")
public class EliminarClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EliminarClientes() {
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
		try {
			switch(tipo) {
			case "cliente":
				adminClientes.bajaUsuario(id);
				break;
			case "actividad":
				adminActividades.EliminarActividad(id);
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
