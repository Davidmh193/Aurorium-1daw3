package ModeloDTA;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import ModeloDTO.Empleado;

public class AdministradoresBBDD {
	
	
	//Modifica los datos del Empleados.
	
	public void modificarEmpleados(String Dni, String Nombre,String apellido, String telefono,String Direccion, String Localidad,String Rol, String Password) throws ClassNotFoundException {

		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("UPDATE empleados SET Nombre=? , Apellido=?, Telefono=?,Direccion=?,Localidad=?,Rol=?,Password=?  WHERE Dni = ?");
			pSt.setString(1, Nombre);
			pSt.setString(2, apellido);
			pSt.setString(3, telefono);
			pSt.setString(4, Direccion);
			pSt.setString(5, Localidad);
			pSt.setString(6, Rol);
			pSt.setString(7, Password);
			pSt.setString(8, Dni);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	//Da de baja a los Empleados.
	public void bajaEmpleados(String Dni) throws ClassNotFoundException {
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("DELETE FROM empleados WHERE Dni=?");
			pSt.setString(1, Dni);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	//Inserta usuarios en la BBDD
	public void InsertarEmpleados(String Dni, String Nombre,String apellido, String telefono,String Direccion, String Localidad,String Rol, String Password) throws ClassNotFoundException{
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("INSERT INTO empleados (Dni, Nombre, Apellido ,Telefono,Direccion ,Localidad,Rol,Password) Values (?,?,?,?,?,?,?,?)");
			pSt.setString(1, Dni);
			pSt.setString(2, Nombre);
			pSt.setString(3, apellido);
			pSt.setString(4, telefono);
			pSt.setString(5, Direccion);
			pSt.setString(6, Localidad);
			pSt.setString(7, Rol);
			pSt.setString(8, Password);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	
	public ArrayList<Empleado> getEmpleados() throws SQLException {
		ArrayList<Empleado> empleados = new ArrayList<>();
		Conector conector = new Conector();
		conector.conectar();

		PreparedStatement pSt = conector.getCon().prepareStatement("SELECT * FROM empleados");
		ResultSet resultado = pSt.executeQuery();
		while (resultado.next()) {
			Empleado usuario = new Empleado();
			
			usuario.setDni(resultado.getString("Dni"));
			usuario.setNombre(resultado.getString("Nombre"));
			usuario.setApellido(resultado.getString("Apellidos"));
			usuario.setTelfeono(resultado.getString("Telefono"));
			usuario.setDireccion(resultado.getString("Direccion"));
			usuario.setLocalidad(resultado.getString("Localidad"));
			usuario.setRol(resultado.getString("Rol"));
			usuario.setPassword(resultado.getString("Password"));
			empleados.add(usuario);
		}
		pSt.close();
		conector.cerrar();
		return empleados;

	}
	
	
	
	
	
}
