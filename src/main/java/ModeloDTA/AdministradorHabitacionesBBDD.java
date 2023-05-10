package ModeloDTA;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ModeloDTO.Habitaciones;

public class AdministradorHabitacionesBBDD {
	
	//muestra las habitaciones
	public ArrayList<Habitaciones> gethabitaciones() throws SQLException {
		ArrayList<Habitaciones> habitaciones = new ArrayList<>();
		Conector conector = new Conector();
		conector.conectar();

		PreparedStatement pSt = conector.getCon().prepareStatement("SELECT * FROM habitaciones");
		ResultSet resultado = pSt.executeQuery();
		while (resultado.next()) {
			Habitaciones usuario = new Habitaciones();
			
			usuario.setIdhabitaciones(resultado.getString("Id_Habitacion"));
			usuario.setPrecio(resultado.getDouble("Precio"));
			usuario.setDescripcion(resultado.getString("Descripcion"));
			usuario.setTipohabitacion(resultado.getString("Tipo_Habitacion"));
			habitaciones.add(usuario);
		}
		pSt.close();
		conector.cerrar();
		return habitaciones;

	}
	
	public void EliminarHabitacion(String Id_Habitacion) throws ClassNotFoundException {
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("DELETE FROM habitaciones WHERE Id_Habitacion=?");
			pSt.setString(1, Id_Habitacion);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	//Insertar habitaciones
	
	

}
