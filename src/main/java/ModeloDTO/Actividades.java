package ModeloDTO;

import java.util.Date;

public class Actividades {
	private String Nombre_actividad;
	private String Codigo_actividad;
	private int max_participantes;
	private double Precio_Actividad;
	public String getNombre_actividad() {
		return Nombre_actividad;
	}
	public void setNombre_actividad(String nombre_actividad) {
		Nombre_actividad = nombre_actividad;
	}
	public String getCodigo_actividad() {
		return Codigo_actividad;
	}
	public void setCodigo_actividad(String codigo_actividad) {
		Codigo_actividad = codigo_actividad;
	}
	public int getMax_participantes() {
		return max_participantes;
	}
	public void setMax_participantes(int max_participantes) {
		this.max_participantes = max_participantes;
	}
	public double getPrecio_Actividad() {
		return Precio_Actividad;
	}
	public void setPrecio_Actividad(double precio_Actividad) {
		Precio_Actividad = precio_Actividad;
	}

}
