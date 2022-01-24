package ar.com.educacionit.clase5.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;


import ar.com.educacionit.clase5.Persona;
import ar.com.educacionit.clase5.collections.Orden.OrdenEnum;

public class MainCollections {

	public static void main(String[] args) {
		int i = 10;
		
		//vector
		int[] edades = new int[10];
		int[] edades2 = new int[] {i};
		
		//recorrer con indices o foreach
		
		//JAVA COLLECTION FRAMEWORK
		//--------------------------
		//colecciones dinamicas
		// Collection<T>
		//- que admitan(LIST) o no duplicadas(SET)
		//- arboles
		//- listas enlazadas
		//- stack/queue
		
		//KEY-VALUE -> MAP
		
		//crear una coleccion
		//no admite duplicados
		Collection<String> nombres = new HashSet<>();
		nombres.add("carlos");
		nombres.add("carlos");
		nombres.add("alan");
		
		System.out.println(nombres);
		
		//Collection<Persona> personas = new HashSet<>();
		Collection<Persona> personas = new ArrayList<>();
		personas.add(new Persona("carlos", "lopez", 83f,"1234"));//son 3 instancias !=
		personas.add(new Persona("carlos", "lopez", 83f,"1234"));
		personas.add(new Persona("juan", "perez", 103f,"1234"));
		
		System.out.println(personas);
		
		//necesito elminar duplicados en un List<T>
		personas = new HashSet<>(personas);
		System.err.println(personas);
		
		//colecciones con orden
		//  10 	20 5  4	
		//  4	5  10 20
		
		// Z	B 	C
		// B    C   Z	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seleccione orden");
		String ordenUsuario = teclado.next();
		teclado.close();
		ClienteOrden.OrdenEnum enum_ = ClienteOrden.OrdenEnum.valueOf(ordenUsuario);
		ClienteOrden orden = OrdenFactory.getOrden(enum_);
		
		Collection<Cliente> datos = new TreeSet<>(orden);
		
		datos.add(new Cliente(1l,"carlos",1000f));
		datos.add(new Cliente(2l,"juan",900f));
		datos.add(new Cliente(3l,"pepe",550f));
		datos.add(new Cliente(4l,"maria",2000f));
		
		for(Cliente dato : datos) {
			System.out.println(dato);
		}
		//order natural
		
		
	}

}
