package ar.com.educacionit.clase5.generics;

import ar.com.educacionit.clase5.Persona;

public class MainGeneric {

	public static void main(String[] args) {
		
		Generador<Persona> gg = new GeneradorPersona();
		Persona valorGG = gg.genear();
		System.out.println(valorGG);
		
		GeneradorNombres gn = new GeneradorNombres();
		String valor = gn.genear();
		System.out.println(valor);
		
		//gg = new GeneradorNombres();
		
		GeneradorPersona gp = new GeneradorPersona();
		Persona valorGP = gp.genear();
		System.out.println(valorGP);
		
		//Iterface i = new ClaseQueImplementa()
		//i = new OtraClaseQueTambienImplementa()
		
	}

}
