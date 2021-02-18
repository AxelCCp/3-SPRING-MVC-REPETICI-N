package EJERCICIO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Pasajero {
	
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Min(value=2,message="Nombre no permitido, debe tener más de 2 carácteres")
	@Max(value=50,message="Nombre no permitido, debe tener menos de 50 carácteres")
	private String nombre;
	private String apellido;
	private int edad;
	private String origen;
	private String destino;
	private String clase;
}
