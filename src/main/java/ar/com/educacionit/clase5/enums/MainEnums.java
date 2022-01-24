package ar.com.educacionit.clase5.enums;

public class MainEnums {

	public static void main(String[] args) {
		
		try {
			metodoLimitado(null);
		} catch (InvalidOpcionException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * -100,20,1500,etc
	 * rango negativo de los int - rango positivo 
	 * @param a
	 * @param b
	 */
	public static void sumar(int a, int b) {
		//
	}
	
	/*
	 * "A", "hola", "una cadena super larga que no tiene limites"
	 */
	public static String recibir(String algo) {
		//
		return algo;
	}
	
	/**
	 * OpcionesEnum.ALTA
	 * OpcionesEnum.BAJA
	 * OpcionesEnum.MODIFICACION
	 * @param opciones
	 */
	public static void metodoLimitado(OpcionesEnum opciones) throws InvalidOpcionException {
		if(opciones == null) {
			throw new InvalidOpcionException("La opciones es inválida");
		}
		
		if(OpcionesEnum.ALTA.equals(opciones)) {
			System.out.println("opcion alta");
		}else if(OpcionesEnum.BAJA.equals(opciones)) {
			System.out.println("opcion baja");
		}else {
			System.out.println("opcion modificacion");
		}			
	}
	
	//INNER CLASS
	/*class InvalidOpcionException extends Exception{
		public InvalidOpcionException(String msj) {
			super(msj);
		}
	}*/
}
