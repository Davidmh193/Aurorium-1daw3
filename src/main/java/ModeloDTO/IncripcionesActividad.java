package ModeloDTO;

public class IncripcionesActividad {
	private String codigo_actividad;
	
	public String getCodigo_actividad() {
		return codigo_actividad;
	}
	public void setCodigo_actividad(String codigo_actividad) {
		this.codigo_actividad = codigo_actividad;
	}
	public String getDni_cliente() {
		return Dni_cliente;
	}
	public void setDni_cliente(String dni_cliente) {
		Dni_cliente = dni_cliente;
	}
	public String getActividad_pagada() {
		return Actividad_pagada;
	}
	public void setActividad_pagada(String actividad_pagada) {
		Actividad_pagada = actividad_pagada;
	}
	private String Dni_cliente;
	private String Actividad_pagada;

}
