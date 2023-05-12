package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.AdministradorActividadesBBDD;
import ModeloDTA.AdministradoresBBDD;

/**
 * Servlet implementation class InsertarActividadesEchas
 */
@WebServlet("/InsertarActividadesEchas")
public class InsertarActividadesEchas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarActividadesEchas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre= request.getParameter("nombre");
		String Codigo = request.getParameter("Codigo");
		String participantes = request.getParameter("participantes");
		String precio = request.getParameter("precio");
	
		AdministradorActividadesBBDD insertarActividades = new AdministradorActividadesBBDD();
        
        try {
        	insertarActividades.InsertarActividades(nombre, Codigo,participantes,precio);
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
