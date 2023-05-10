package ModeloDTA;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ModeloDTO.Contacto;

public class ContactoBBDD {
	
	public void ReservasUsuarios(String Dni,String nombreapellido, String Email,String Telefono,String Mensaje) throws ClassNotFoundException{
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("INSERT INTO contacto (Dni, Nombre_apellido, Email,Telefono ,Mensaje) Values (?,?,?,?,?)");
			pSt.setString(1, Dni);
			pSt.setString(2, nombreapellido);
			pSt.setString(3, Email);
			pSt.setString(4, Telefono);
			pSt.setString(5, Mensaje);
			
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	public ArrayList<Contacto> getContactos() throws SQLException {
		ArrayList<Contacto> contacto = new ArrayList<>();
		Conector conector = new Conector();
		conector.conectar();

		PreparedStatement pSt = conector.getCon().prepareStatement("SELECT * FROM contacto");
		ResultSet resultado = pSt.executeQuery();
		while (resultado.next()) {
			Contacto usuario = new Contacto();
			
			usuario.setDni(resultado.getString("Dni"));
			usuario.setNombreapellido(resultado.getString("Nombre_apellido"));
			usuario.setEmail(resultado.getString("Email"));
			usuario.setTelefono(resultado.getString("Telefono"));
			usuario.setMensaje(resultado.getString("Mensaje"));
			contacto.add(usuario);
		}
		pSt.close();
		conector.cerrar();
		return contacto;

	}
	//Elimina los contactos
	public void EliminarContacto(String contacto) throws ClassNotFoundException {
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("DELETE FROM contacto WHERE Dni=?");
			pSt.setString(1, contacto);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
