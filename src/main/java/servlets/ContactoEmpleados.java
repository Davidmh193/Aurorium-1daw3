package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDTA.ContactoBBDD;
import ModeloDTO.Contacto;

/**
 * Servlet implementation class ContactoEmpleados
 */
@WebServlet("/ContactoEmpleados")
public class ContactoEmpleados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactoEmpleados() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String tipo = request.getParameter("tipo");
		ContactoBBDD contactoEliminar= new ContactoBBDD();
		
		try {
			switch(tipo) {
			case "Eliminarcontacto":
				contactoEliminar.EliminarContacto(id);
				break;
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ContactoBBDD ContactoCliente = new ContactoBBDD();
		
		ArrayList<Contacto> contacto = new ArrayList<Contacto>();
		
		try {
			contacto= ContactoCliente.getContactos();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		request.setAttribute("contacto", contacto);
		
		request.getRequestDispatcher("ContactoAdministracion.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
