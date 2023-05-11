package ModeloDTA;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ModeloDTO.Clientes;

public class AdministradorClientesBBDD {
	// Modifica las actividades ya creadas
	public void modificarClientes(String Nombre, String Apellidos, String Telefono, String Direccion, String Localidad,
			String Dni) throws ClassNotFoundException {

		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement(
					"UPDATE clientes SET Nombre=? , Apellidos=?, Telefono=?,Direccion=?,Localidad=?  WHERE Dni = ?");
			pSt.setString(1, Nombre);
			pSt.setString(2, Apellidos);
			pSt.setString(3, Telefono);
			pSt.setString(4, Direccion);
			pSt.setString(5, Localidad);
			pSt.setString(6, Dni);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// Da de baja a los Clientes y las actividades que hayan sido registradas.
	public void bajaUsuario(String Dni) throws ClassNotFoundException {
		String sentencia = "DELETE FROM inscripciones WHERE Dni_cliente=?";
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement(sentencia);
			pSt.setString(1, Dni);
			pSt.execute();
			sentencia = "DELETE FROM clientes WHERE Dni=?";
			pSt = conector.getCon().prepareStatement(sentencia);
			pSt.setString(1, Dni);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// Inserta usuarios nuevos en la BBDD
	public void InsertarClientes(String Dni, String Nombre, String Apellidos, String telefono, String direccion,
			String localidad) throws ClassNotFoundException {
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement(
					"INSERT INTO clientes (Dni, Nombre, Apellidos ,Telefono,Direccion ,Localidad) Values (?,?,?,?,?,?)");
			pSt.setString(1, Dni);
			pSt.setString(2, Nombre);
			pSt.setString(3, Apellidos);
			pSt.setString(4, telefono);
			pSt.setString(5, direccion);
			pSt.setString(6, localidad);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// Visualiza los clientes
	public ArrayList<Clientes> getClientes() throws SQLException {
		ArrayList<Clientes> clientes = new ArrayList<>();
		Conector conector = new Conector();
		conector.conectar();

		PreparedStatement pSt = conector.getCon().prepareStatement("SELECT * FROM clientes");
		ResultSet resultado = pSt.executeQuery();
		while (resultado.next()) {
			Clientes usuario = new Clientes();

			usuario.setDni(resultado.getString("Dni"));
			usuario.setNombre(resultado.getString("Nombre"));
			usuario.setApellidos(resultado.getString("Apellidos"));
			usuario.setTelefono(resultado.getString("Telefono"));
			usuario.setDireccion(resultado.getString("Direccion"));
			usuario.setLocalidad(resultado.getString("Localidad"));
			clientes.add(usuario);
		}
		pSt.close();
		conector.cerrar();
		return clientes;

	}

}
