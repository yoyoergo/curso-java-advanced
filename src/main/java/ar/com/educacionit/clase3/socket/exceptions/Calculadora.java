package ar.com.educacionit.clase3.socket.exceptions;

import java.io.Closeable;
import java.io.IOException;

public class Calculadora implements Closeable{

	public float dividir(float a, float b) throws MiExeption{
		if(b == 0) {
			//creo mi propia exception
			throw new MiExeption("No se puede dividir por 0");
		}
		return a/b;
	}
	
	class MiExeption extends Exception  {
		public MiExeption(String msj) {
			super(msj);
		}
	}
	
	public void close() throws IOException {
		System.out.println("cerrando calculadora");
	}
}
