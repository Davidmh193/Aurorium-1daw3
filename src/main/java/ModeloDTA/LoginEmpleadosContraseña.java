package ModeloDTA;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ModeloDTO.Empleados;

public class LoginEmpleadosContraseña {

	//Login empleados
	
	/*public Boolean LoginEmpleados(String Dni,String Password) throws ClassNotFoundException {
		boolean encontrado = false;
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("Select * FROM empleados WHERE Dni=? and Password=?");
			pSt.setString(1, Dni);
			pSt.setString(2, Password);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return encontrado;
	}
}*/
	
public Empleados LoginEmpleados(String Dni,String Password)throws ClassNotFoundException {
	

Empleados empleado = new Empleados();

try {
	
	Conector conector = new Conector();
	conector.conectar();

	PreparedStatement pSt = conector.getCon().prepareStatement("Select * FROM empleados WHERE Dni=? and Password=?");
	pSt.setString(1, Dni);
	pSt.setString(2, Password);
	pSt.execute();

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