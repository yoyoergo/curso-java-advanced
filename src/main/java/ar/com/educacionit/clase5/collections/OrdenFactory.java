package ar.com.educacionit.clase5.collections;

import java.util.HashMap;
import java.util.Map;

import ar.com.educacionit.clase5.collections.Orden.OrdenEnum;

public final class OrdenFactory {

	private static Map<OrdenEnum, Orden> mapOrdenamiento;
	private static Map<ClienteOrden.OrdenEnum, ClienteOrden> mapClienteOrdenamiento;
	
	static {
		mapOrdenamiento = new HashMap<>();
		mapOrdenamiento.put(OrdenEnum.ASC, new OrdenASC());
		mapOrdenamiento.put(OrdenEnum.DESC, new OrdenDESC());
		mapOrdenamiento.put(OrdenEnum.DEFECTO, new OrdenDefault());
		
		//cliente
		mapClienteOrdenamiento = new HashMap<>();
		mapClienteOrdenamiento.put(ClienteOrden.OrdenEnum.ASC, new ClienteOrdenASC());
		mapClienteOrdenamiento.put(ClienteOrden.OrdenEnum.DESC, new ClienteOrdenDESC());
		mapClienteOrdenamiento.put(ClienteOrden.OrdenEnum.SALDOASC, new ClienteSaldoASC());
		mapClienteOrdenamiento.put(ClienteOrden.OrdenEnum.SALDODESC, new ClienteSaldoDESC());
	}
	
	public static Orden getOrden(OrdenEnum ordenEnum) {
		Orden orden = mapOrdenamiento.get(ordenEnum);
		if(orden == null) {
			orden = mapOrdenamiento.get(OrdenEnum.DEFECTO);
		}
		return orden;
	}
	
	public static ClienteOrden getOrden(ClienteOrden.OrdenEnum ordenEnum) {
		ClienteOrden orden = mapClienteOrdenamiento.get(ordenEnum);
		if(orden == null) {
			orden = mapClienteOrdenamiento.get(ClienteOrden.OrdenEnum.DEFECTO);
		}
		return orden;
	}
}
