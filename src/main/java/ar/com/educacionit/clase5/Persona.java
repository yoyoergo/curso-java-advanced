package ar.com.educacionit.clase5;

import java.io.Serializable;
import java.util.Objects;

public class Persona implements Serializable{

	private String nombre;
	private String apellido;
	private Float peso;
	private String dni;
	
	public Persona(String nombre, String apellido, Float peso,String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.peso = peso;
		this.dni = dni;
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

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", peso=" + peso + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}
	
	//Object
	//hashcode: la posicion de memoria
	//equals: objeto es igual a otro: negocio
	
}
