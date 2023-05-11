package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.AdministradorClientesBBDD;

/**
 * Servlet implementation class ModificarClientes
 */
@WebServlet("/ModificarClientes")
public class ModificarClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarClientes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		request.getRequestDispatcher("/Administracion").forward(request,response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdministradorClientesBBDD clientesmod = new AdministradorClientesBBDD();
		
		String dni= request.getParameter("dnicliente");
		String nombre=  request.getParameter("nombrecliente");
		String apellidos=  request.getParameter("apellidocliente");
		String telefono=  request.getParameter("telefonocliente");
		String direccion=  request.getParameter("Direccioncliente");
		String localidad=  request.getParameter("Localidadcliente");
		
		
		try {
			clientesmod.modificarClientes(nombre, apellidos, telefono, direccion, localidad,dni);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		request.getRequestDispatcher("/Administracion").forward(request,response);
		
		
	}

}
