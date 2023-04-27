package ModeloDTA;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactoBBDD {
	
	public void ReservasUsuarios(String Dni,String Nombre_apellido, String Email,String Telefono,String Mensaje) throws ClassNotFoundException{
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("INSERT INTO contacto (Dni, Nombre_apellido, Email,Telefono ,Mensaje) Values (?,?,?,?,?)");
			pSt.setString(1, Dni);
			pSt.setString(2, Nombre_apellido);
			pSt.setString(3, Email);
			pSt.setString(4, Telefono);
			pSt.setString(5, Mensaje);
			
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
