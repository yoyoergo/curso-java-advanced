package ar.com.educacionit.clase5.collections;

public class ClienteOrdenDESC extends ClienteOrden {
	
	public int compare(Cliente o1, Cliente o2) {
		return o2.compareTo(o1);
	}

}
