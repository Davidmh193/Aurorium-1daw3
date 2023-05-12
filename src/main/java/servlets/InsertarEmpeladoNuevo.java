package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.AdministradoresBBDD;

/**
 * Servlet implementation class InsertarEmpeladoNuevo
 */
@WebServlet("/InsertarEmpeladoNuevo")
public class InsertarEmpeladoNuevo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarEmpeladoNuevo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dni = request.getParameter("dni");
		String nombre = request.getParameter("Nombre");
		String apellido = request.getParameter("Apellido");
		String telefono = request.getParameter("telefono");
		String direccion = request.getParameter("direccion");
		String localidad = request.getParameter("localidad");
		String rol = request.getParameter("rol");
		String password = request.getParameter("password");
		AdministradoresBBDD InsertarEmpleados = new AdministradoresBBDD();
        
        try {
        	InsertarEmpleados.InsertarEmpleados(dni, nombre,apellido,telefono,direccion,localidad,rol,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        request.getRequestDispatcher("/Empleados").forward(request, response);

	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
