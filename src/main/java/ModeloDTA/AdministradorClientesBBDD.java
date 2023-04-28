package ModeloDTA;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdministradorClientesBBDD {

	
	public void modificarCliente(String Dni, String Nombre,String apellido, String telefono,String Direccion, String Localidad) throws ClassNotFoundException {

		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("UPDATE clientes SET Nombre=? , Apellido=?, Telefono=?,Direccion=?,Localidad=?  WHERE Dni = ?");
			pSt.setString(1, Nombre);
			pSt.setString(2, apellido);
			pSt.setString(3, telefono);
			pSt.setString(4, Direccion);
			pSt.setString(5, Localidad);
			pSt.setString(6, Dni);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	//Da de baja a los Clientes.
	public void bajaUsuario(String Dni) throws ClassNotFoundException {
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("DELETE FROM clientes WHERE Dni=?");
			pSt.setString(1, Dni);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	
	//Inserta usuarios
	public void InsertarUsuarios(String Dni, String Nombre,String apellido, String telefono,String Direccion, String Localidad) throws ClassNotFoundException{
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("INSERT INTO clientes (Dni, Nombre, Apellido ,Telefono,Direccion ,Localidad) Values (?,?,?,?,?,?)");
			pSt.setString(1, Dni);
			pSt.setString(1, Nombre);
			pSt.setString(2, apellido);
			pSt.setString(3, telefono);
			pSt.setString(4, Direccion);
			pSt.setString(5, Localidad);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	
	

}
