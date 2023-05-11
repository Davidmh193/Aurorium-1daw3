package ModeloDTA;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ModeloDTO.Actividades;

public class AdministradorActividadesBBDD {
	
	public void modificarActiviades(String Nombre_actividad, int participantes, double precio,String Codigo_actividad) throws ClassNotFoundException {

		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("UPDATE actividades SET Nombre_Actividad=? , Max_Participantes=?,Precio_Actividad=? WHERE Codigo_Actividad = ?");
			pSt.setString(1, Nombre_actividad);
			pSt.setInt(2, participantes);
			pSt.setDouble(3, precio);
			pSt.setString(4, Codigo_actividad);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	
	
	public void EliminarActividad(String Codigo_Actividad) throws ClassNotFoundException {
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("DELETE FROM actividades WHERE Codigo_Actividad=?");
			pSt.setString(1, Codigo_Actividad);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
		
		public void InsertarActividades(String Nombre_actividad, String Codigo_actividad, String max_participantes,String Precio_Actividad) throws ClassNotFoundException{
			try {
				Conector conector = new Conector();
				conector.conectar();

				PreparedStatement pSt = conector.getCon().prepareStatement("INSERT INTO actividades (Nombre_Actividad, Codigo_Actividad, Max_Participantes,Precio_Actividad ) Values (?,?,?,?,?)");
				pSt.setString(1, Nombre_actividad);
				pSt.setString(2, Codigo_actividad);
				pSt.setString(3, max_participantes);
				pSt.setString(4, Precio_Actividad);
				pSt.execute();
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
	}
	
		
		public ArrayList<Actividades> getActividades() throws SQLException {
			ArrayList<Actividades> actividades = new ArrayList<>();
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("SELECT * FROM actividades");
			ResultSet resultado = pSt.executeQuery();
			while (resultado.next()) {
				Actividades usuario = new Actividades();
				
				usuario.setNombre_actividad(resultado.getString("Nombre_Actividad"));
				usuario.setCodigo_actividad(resultado.getString("Codigo_Actividad"));
				usuario.setMax_participantes(resultado.getInt("Max_Participantes"));
				usuario.setPrecio_Actividad(resultado.getDouble("Precio_Actividad"));
				actividades.add(usuario);
			}
			pSt.close();
			conector.cerrar();
			return actividades;

		}
	
	
	

}
