package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.AdministradorClientesBBDD;

/**
 * Servlet implementation class InsertarClientes
 */
@WebServlet("/InsertarClientes")
public class InsertarClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarClientes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("GraciasCompra.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dni = request.getParameter("dnicliente");
		String nombre = request.getParameter("Nombre");
		String apellido = request.getParameter("Apellido");
		String telefono = request.getParameter("telefono");
		String direccion = request.getParameter("direccion");
		String localidad = request.getParameter("localidad");
		AdministradorClientesBBDD Insetarcliente = new AdministradorClientesBBDD();
        
        try {
        	Insetarcliente.InsertarClientes(dni, nombre,apellido,telefono,direccion,localidad);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("GraciasCompra.jsp").forward(request,response);

	}

}
