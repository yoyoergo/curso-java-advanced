package ar.com.educacionit.clase5.generics;

import ar.com.educacionit.clase5.Persona;

public class GeneradorPersona implements Generador<Persona> {

	@Override
	public Persona genear() {
		return new Persona("juan","martin",85f,"1234");
	}

}
