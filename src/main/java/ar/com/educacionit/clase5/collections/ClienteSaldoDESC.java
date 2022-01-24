package ar.com.educacionit.clase5.collections;

public class ClienteSaldoDESC extends ClienteOrden {
	
	public int compare(Cliente o1, Cliente o2) {
		return o2.getSaldo().compareTo(o1.getSaldo());
	}

}
