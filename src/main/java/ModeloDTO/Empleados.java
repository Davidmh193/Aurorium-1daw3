package ModeloDTO;

public class Empleados {
	private String dni;
	private String Nombre_empleado;
	private String apellido_empleado;
	private String telefono_empleado;
	private String Direccion_empleado;
	private String Localidad_empleado;
	private String Rol;
	private String password;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre_empleado() {
		return Nombre_empleado;
	}
	public void setNombre_empleado(String nombre_empleado) {
		Nombre_empleado = nombre_empleado;
	}
	public String getApellido_empleado() {
		return apellido_empleado;
	}
	public void setApellido_empleado(String apellido_empleado) {
		this.apellido_empleado = apellido_empleado;
	}
	public String getTelefono_empleado() {
		return telefono_empleado;
	}
	public void setTelefono_empleado(String telefono_empleado) {
		this.telefono_empleado = telefono_empleado;
	}
	public String getDireccion_empleado() {
		return Direccion_empleado;
	}
	public void setDireccion_empleado(String direccion_empleado) {
		Direccion_empleado = direccion_empleado;
	}
	public String getLocalidad_empleado() {
		return Localidad_empleado;
	}
	public void setLocalidad_empleado(String localidad_empleado) {
		Localidad_empleado = localidad_empleado;
	}
	public String getRol() {
		return Rol;
	}
	public void setRol(String rol) {
		Rol = rol;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
