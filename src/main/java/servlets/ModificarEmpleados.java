package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.ModificarEmpleadosBBDD;

/**
 * Servlet implementation class ModificarEmpleados
 */
@WebServlet("/ModificarEmpleados")
public class ModificarEmpleados extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModificarEmpleados() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 ModificarEmpleadosBBDD empleados= new ModificarEmpleadosBBDD();

		String Dni = request.getParameter("dniempleados");
		String Nombre = request.getParameter("nombreempleados");
		String Apellido = request.getParameter("apellidoempleados");
		String telefono = request.getParameter("telefonoempleados");
		String direccion = request.getParameter("Direccionempleados");
		String localidad = request.getParameter("Localidadempleados");
		String rol = request.getParameter("Rol");
		String password = request.getParameter("Password");
		try {
			empleados.modificarEmpleados(Dni, Nombre, Apellido, telefono, direccion, localidad, rol, password);
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.sendRedirect(request.getContextPath()+"/Empleados");

	}

}
