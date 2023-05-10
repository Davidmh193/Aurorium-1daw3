package ModeloDTA;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import ModeloDTO.IncripcionesActividad;
import ModeloDTO.Reservas;

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
	

	
	
	
	public ArrayList<Reservas> getReservashabitaciones() throws SQLException {
		ArrayList<Reservas> reservashabitaciones = new ArrayList<>();
		Conector conector = new Conector();
		conector.conectar();

		PreparedStatement pSt = conector.getCon().prepareStatement("SELECT * FROM reservas");
		ResultSet resultado = pSt.executeQuery();
		while (resultado.next()) {
			Reservas usuario = new Reservas();
			
			usuario.setIdHabitacion(resultado.getString("Id_Habitacion"));
			usuario.setDniClientes(resultado.getString("Dni_Cliente"));
			usuario.setFecha_inicio(resultado.getDate("Fecha_Entrada"));
			usuario.setFecha_salida(resultado.getDate("Fecha_Salida"));
			
			reservashabitaciones.add(usuario);
		}
		pSt.close();
		conector.cerrar();
		return reservashabitaciones;

	}
	
	public ArrayList<IncripcionesActividad> getActividadesReserva() throws SQLException {
		ArrayList<IncripcionesActividad> actividadescreadas1 = new ArrayList<>();
		Conector conector = new Conector();
		conector.conectar();

		PreparedStatement pSt = conector.getCon().prepareStatement("SELECT * FROM inscripciones");
		ResultSet resultado = pSt.executeQuery();
		while (resultado.next()) {
			IncripcionesActividad usuario = new IncripcionesActividad();
			
			usuario.setDni_cliente(resultado.getString("Dni_Cliente"));
			usuario.setCodigo_actividad(resultado.getString("Codigo_Actividad"));
			usuario.setActividad_pagada(resultado.getBoolean("Actividad_Pagada"));
			usuario.setFecha_actividad(resultado.getDate("Fecha_actividad"));
			actividadescreadas1.add(usuario);
		}
		pSt.close();
		conector.cerrar();
		return actividadescreadas1;

	}
	public void EliminarReserva(String Reserva) throws ClassNotFoundException {
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("DELETE FROM reservas WHERE Dni_Cliente=?");
			pSt.setString(1, Reserva);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
