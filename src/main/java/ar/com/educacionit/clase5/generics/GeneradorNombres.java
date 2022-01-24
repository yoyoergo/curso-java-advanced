package ar.com.educacionit.clase5.generics;

public class GeneradorNombres implements Generador<String> {

	@Override
	public String genear() {
		return "soy algo generado por un generador de nombres";
	}

}
