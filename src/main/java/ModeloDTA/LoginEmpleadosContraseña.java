package ModeloDTA;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ModeloDTO.Empleado;

public class LoginEmpleadosContraseña {
	
	//Login de empleados, sirve para entrar a la aplicacion a los Adminisrtadores.
	public Empleado LoginEmpleados(String Dni, String Password) throws ClassNotFoundException {

		Empleado empleado = new Empleado();

		try {

			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon()
					.prepareStatement("Select * FROM empleados WHERE Dni=? and Password=?");
			pSt.setString(1, Dni);
			pSt.setString(2, Password);

			ResultSet r = pSt.executeQuery();

			r.next();
			empleado.setDni(r.getString(1));

			empleado.setPassword(r.getString(2));

			conector.cerrar();

		} catch (Exception e) {

			e.printStackTrace();

		}
		return empleado;
	}
}