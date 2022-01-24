package ar.com.educacionit.clase4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.educacionit.clase3.Empleado;

public class MainStream {

	public static void main(String[] args) {
		
		Empleado empleado = new Empleado("carlos",false,null);
		Empleado empleado2 = new Empleado("juan",false,null);
		Empleado empleado3 = new Empleado("jose",true,null);
		
		List<Empleado> edades = new ArrayList<Empleado>();
		edades.add(empleado);
		edades.add(empleado2);
		edades.add(empleado3);
		
		System.out.println(edades);
		
		List<Boolean> edadesFiltradas = edades.stream()
				.filter(x -> x.isEsJefe() == true) // operacion intermedia
				.map(x -> x.isEsJefe())
				.collect(Collectors.toList());//operacion terminal
		
		System.out.println(edadesFiltradas);
	}
}
