package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ModeloDTA.LoginEmpleadosContraseña;
import ModeloDTO.Empleados;

/**
 * Servlet implementation class LoginEmpleados
 */
@WebServlet("/LoginEmpleados")
public class LoginEmpleados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginEmpleados() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Empleados empleado = new Empleados();
		/*LoginEmpleadosContraseña.class(request.getParameter("username"), request.getParameter("password"));*/

		if (empleado!=null) {

		HttpSession session = request.getSession();

		session.setAttribute("usuario", empleado);

		///insertar html de Administracion 
		response.sendRedirect(request.getContextPath()+"//");

		}else {
		//Lleva a un usuario al menu
		response.sendRedirect(request.getContextPath()+"/Indext");

		}
	
}
	}

