package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.AdministradorActividadesBBDD;

/**
 * Servlet implementation class ModificarActiviades
 */
@WebServlet("/ModificarActiviades")
public class ModificarActiviades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarActiviades() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/Administracion").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
AdministradorActividadesBBDD AdminActividades = new AdministradorActividadesBBDD();		
		
		String ActividadNombre = request.getParameter("NombreActividad");
		String Codigo = request.getParameter("CodigoActividad");
		int participantes= Integer.parseInt(request.getParameter("Participantes"));
		double Precio= Double.parseDouble(request.getParameter("PrecioActividad"));
		
		
		try {
			AdminActividades.modificarActiviades(ActividadNombre, participantes, Precio, Codigo);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/Administracion").forward(request,response);
		
	}

}
