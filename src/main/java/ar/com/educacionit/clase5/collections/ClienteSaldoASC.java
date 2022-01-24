package ar.com.educacionit.clase5.collections;

public class ClienteSaldoASC extends ClienteOrden {
	
	public int compare(Cliente o1, Cliente o2) {
		return o1.getSaldo().compareTo(o2.getSaldo());
	}

}
