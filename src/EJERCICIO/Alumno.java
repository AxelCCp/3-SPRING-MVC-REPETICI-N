package EJERCICIO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class Alumno {
	
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
	public String getOptativa() {
		return optativa;
	}
	public void setOptativa(String optativa) {
		this.optativa = optativa;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCodigopostal() {
		return codigopostal;
	}
	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}


	@NotNull
	@Size(min=2,message="Campo requerido")
	private String nombre;
	private String apellido;
	private String optativa;
	private String ciudad;
	private String idioma;
	@Min(value=10, message="No se permiten edades menores de 10 años")
	@Max(value=100, message="No se permiten edades mayores de 100 años")
	private int edad;
	@Email
	private String email;
	//permite numeros del 0 al 9, debe haber 5 numeros el la expresión.
	@Pattern(regexp="[0-9]{5}",message="Solo 5 valores numéricos")
	private String codigopostal;
	
}
