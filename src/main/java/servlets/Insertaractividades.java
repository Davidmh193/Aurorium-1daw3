package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.InscripcionesBBDD;

/**
 * Servlet implementation class Insertaractividades
 */
@WebServlet("/Insertaractividades")
public class Insertaractividades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insertaractividades() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String FechaEntrada = request.getParameter("FechaEntrada");
		String Dni = request.getParameter("Dni");
		
		String Codigo = request.getParameter("Desplegable");
		InscripcionesBBDD Reservas = new InscripcionesBBDD();
		Date FechaEntra2 = null;
		
        try {
        	FechaEntra2 = new SimpleDateFormat("yyyy-MM-dd").parse(FechaEntrada);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        try {
			Reservas.InsertarInscripciones(FechaEntra2, Codigo,Dni);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("InsertarCliente.jsp").forward(request,response);
		
		
		
		
		
		
		
		
		
		/*Inserta Actividades
		String nombre = request.getParameter("nombre");
		String dni = request.getParameter("dni");
		String codigo = request.getParameter("codigo");
		String password = request.getParameter("password");
		String FechaActividad = request.getParameter("fecha_login");
		AdministradorActividadesBBDD InsertActividades = new AdministradorActividadesBBDD();
        java.util.Date fecha = null;
		

        try {
        	fecha = new SimpleDateFormat("yyyy-MM-dd").parse(FechaActividad);
        } catch (ParseException e) {
            e.printStackTrace();
        }
		try {
			InsertActividades.InsertarActividades(nombre, dni, codigo,password ,fecha);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("nombre", nombre);
		
		request.getRequestDispatcher("/Administracion").forward(request,response);
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
