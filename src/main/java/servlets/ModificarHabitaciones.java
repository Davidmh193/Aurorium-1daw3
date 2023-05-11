package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.AdministradorHabitacionesBBDD;

/**
 * Servlet implementation class ModificarHabitaciones
 */
@WebServlet("/ModificarHabitaciones")
public class ModificarHabitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarHabitaciones() {
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
AdministradorHabitacionesBBDD habitaciones = new AdministradorHabitacionesBBDD();
		
		
		String id= request.getParameter("idhabitacion");
		double precio = Double.parseDouble(request.getParameter("precio"));
		String descripcion=  request.getParameter("descripcion");
		String tipohabitacion=  request.getParameter("tipohabitacion");
		
		
		
		try {
			habitaciones.modificarHabitaciones(id, precio, descripcion, tipohabitacion);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		

		
		request.getRequestDispatcher("/Administracion").forward(request,response);
		
	}

}
