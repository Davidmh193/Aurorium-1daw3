package ModeloDTA;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class InscripcionesBBDD {
	//Inserta Inscripciones
	public void InsertarInscripciones( Date fechaEntrada,String Codigo_actividad,String dni) throws ClassNotFoundException {
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement(
					"INSERT INTO inscripciones (Codigo_Actividad, Dni_Cliente,Fecha_actividad ) Values (?,?,?)");
			pSt.setString(1, Codigo_actividad);
			pSt.setString(2, dni);
			pSt.setDate(3, new java.sql.Date(fechaEntrada.getTime()));
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
