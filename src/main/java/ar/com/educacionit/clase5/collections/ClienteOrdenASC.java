package ar.com.educacionit.clase5.collections;

public class ClienteOrdenASC extends ClienteOrden {
	
	public int compare(Cliente o1, Cliente o2) {
		return o1.compareTo(o2);
	}

}
