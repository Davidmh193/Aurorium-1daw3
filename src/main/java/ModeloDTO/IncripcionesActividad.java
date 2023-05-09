package ModeloDTO;

import java.util.Date;

public class IncripcionesActividad {
	private String codigo_actividad;
	private String Dni_cliente;
	private boolean Actividad_pagada;
	private Date Fecha_actividad;
	
	public String getCodigo_actividad() {
		return codigo_actividad;
	}
	public void setCodigo_actividad(String codigo_actividad) {
		this.codigo_actividad = codigo_actividad;
	}
	public String getDni_cliente() {
		return Dni_cliente;
	}
	public boolean isActividad_pagada() {
		return Actividad_pagada;
	}
	public void setActividad_pagada(boolean actividad_pagada) {
		Actividad_pagada = actividad_pagada;
	}
	public Date getFecha_actividad() {
		return Fecha_actividad;
	}
	public void setFecha_actividad(Date fecha_actividad) {
		Fecha_actividad = fecha_actividad;
	}
	public void setDni_cliente(String dni_cliente) {
		Dni_cliente = dni_cliente;
	}


}
