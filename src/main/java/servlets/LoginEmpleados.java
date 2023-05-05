package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ModeloDTA.LoginEmpleadosContraseña;
import ModeloDTO.Empleado;

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

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginEmpleadosContraseña Login = new LoginEmpleadosContraseña();
		Empleado empleado = new Empleado();
		
		try {
			empleado = Login.LoginEmpleados(request.getParameter("Dni"), request.getParameter("Password"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (empleado!=null) {

		HttpSession session = request.getSession();

		session.setAttribute("usuario", empleado);

		///insertar html de Administracion 
		response.sendRedirect(request.getContextPath()+"/Administracion");

		}else {
		//Lleva a un usuario al menu
		response.sendRedirect(request.getContextPath()+"/Login");

		}
	
}
	}

