package ModeloDTA;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ModificarEmpleadosBBDD {
	
	//Modifica los datos de los empleados
	public void modificarEmpleados(String Dni,String Nombre, String Apellido, String telefono,String direccion,String localidad,String rol, String password) throws ClassNotFoundException {

		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("UPDATE empleados SET Nombre=? , Apellidos=?, Telefono=?,Direccion=?,Localidad=?,Rol=?,Password=?  WHERE Dni = ?");
			pSt.setString(1, Nombre);
			pSt.setString(2, Apellido);
			pSt.setString(3, telefono);
			pSt.setString(4, direccion);
			pSt.setString(5, localidad);
			pSt.setString(6, rol);
			pSt.setString(7, password);
			pSt.setString(8, Dni);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	//Inserta nuevo empleados
	
	public void Insertarempleados(String Dni, String Nombre,String apellido, String telefono,String Direccion, String Localidad,String Rol,String Password) throws ClassNotFoundException{
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("INSERT INTO empleados (Dni, Nombre, Apellidos ,Telefono,Direccion ,Localidad,Rol,Password) Values (?,?,?,?,?,?,?,?)");
			pSt.setString(1, Dni);
			pSt.setString(1, Nombre);
			pSt.setString(2, apellido);
			pSt.setString(3, telefono);
			pSt.setString(4, Direccion);
			pSt.setString(5, Localidad);
			pSt.setString(6, Rol);
			pSt.setString(7, Password);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
}
