package ModeloDTA;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class ReservasBBDD {
	
	
	public void ReservasUsuarios(Date FechaEntrada,Date FechaSalida, String DniReserva,String Habitaciones) throws ClassNotFoundException{
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("INSERT INTO reservas (Id_Habitacion, Dni_Cliente, Fecha_Entrada,Fecha_Salida) Values (?,?,?,?)");
			pSt.setString(2, DniReserva);
			pSt.setString(1, Habitaciones);
			pSt.setDate(3, new java.sql.Date( FechaSalida.getTime()));
			pSt.setDate(4, new java.sql.Date( FechaEntrada.getTime()));
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
