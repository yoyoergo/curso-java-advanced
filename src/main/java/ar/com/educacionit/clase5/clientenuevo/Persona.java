package ar.com.educacionit.clase5.clientenuevo;

import java.io.Serializable;

public class Persona implements Serializable{

	private String nombre;
	private String apellido;
	private Float peso;
	
	public Persona(String nombre, String apellido, Float peso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.peso = peso;
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
	
	
}
