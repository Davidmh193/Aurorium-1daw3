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

import ModeloDTA.ReservasBBDD;

/**
 * Servlet implementation class Reservas
 */
@WebServlet("/Reservas")
public class Reservas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reservas() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Finalizado
		String FechaEntrada = request.getParameter("FechaEntrada");
		String FechaSalida = request.getParameter("FechaSalida");
		String DniReserva = request.getParameter("Dni");
		String Habitaciones = request.getParameter("Desplegable");
		ReservasBBDD Reservas = new ReservasBBDD();
		
		
		Date FechaEntra2 = null;
		Date FechaSali2 = null;
        try {
        	FechaEntra2 = new SimpleDateFormat("yyyy-MM-dd").parse(FechaEntrada);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
        	FechaSali2 = new SimpleDateFormat("yyyy-MM-dd").parse(FechaSalida);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        try {
			Reservas.ReservasUsuarios(FechaEntra2, FechaSali2, DniReserva,Habitaciones);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("InsertarCliente.jsp").forward(request,response);
	}

}
