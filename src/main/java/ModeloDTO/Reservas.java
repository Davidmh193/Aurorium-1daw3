package ModeloDTO;

import java.util.Date;

public class Reservas {
	private int IdHabitacion;
	private String DniClientes;
	private Date Fecha_inicio;
	public int getIdHabitacion() {
		return IdHabitacion;
	}
	public void setIdHabitacion(int idHabitacion) {
		IdHabitacion = idHabitacion;
	}
	public String getDniClientes() {
		return DniClientes;
	}
	public void setDniClientes(String dniClientes) {
		DniClientes = dniClientes;
	}
	public Date getFecha_inicio() {
		return Fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		Fecha_inicio = fecha_inicio;
	}
	public Date getFecha_salida() {
		return Fecha_salida;
	}
	public void setFecha_salida(Date fecha_salida) {
		Fecha_salida = fecha_salida;
	}
	private Date Fecha_salida;

}
