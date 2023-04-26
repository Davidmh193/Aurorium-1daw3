package ModeloDTO;

public class Hoteles {
	private int Id_hotel;
	private String Nombre_Hotel;
	private String Direccion_hotel;
	private int numero_estrellas;
	
	public int getId_hotel() {
		return Id_hotel;
	}
	public void setId_hotel(int id_hotel) {
		Id_hotel = id_hotel;
	}
	public String getNombre_Hotel() {
		return Nombre_Hotel;
	}
	public void setNombre_Hotel(String nombre_Hotel) {
		Nombre_Hotel = nombre_Hotel;
	}
	public String getDireccion_hotel() {
		return Direccion_hotel;
	}
	public void setDireccion_hotel(String direccion_hotel) {
		Direccion_hotel = direccion_hotel;
	}
	public int getNumero_estrellas() {
		return numero_estrellas;
	}
	public void setNumero_estrellas(int numero_estrellas) {
		this.numero_estrellas = numero_estrellas;
	}
}
