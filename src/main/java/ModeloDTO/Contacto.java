package ModeloDTO;

public class Contacto {
	private String dni;
	private String nombreapellido;
	private String email;
	private String telefono;
	private String mensaje;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombreapellido() {
		return nombreapellido;
	}
	public void setNombreapellido(String nombreapellido) {
		this.nombreapellido = nombreapellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
