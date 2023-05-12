package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.AdministradorHabitacionesBBDD;

/**
 * Servlet implementation class InsertarHabitacionesNuevas
 */
@WebServlet("/InsertarHabitacionesNuevas")
public class InsertarHabitacionesNuevas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarHabitacionesNuevas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Id= request.getParameter("Id");
		String precio = request.getParameter("precio");
		String descripcion = request.getParameter("descripcion");
		String tipo = request.getParameter("tipo");
	
		AdministradorHabitacionesBBDD InsertarHabitaciones = new AdministradorHabitacionesBBDD();
        
        try {
        	InsertarHabitaciones.InsertarHabitaciones(Id, precio,descripcion,tipo);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        request.getRequestDispatcher("/Administracion").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
