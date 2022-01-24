package ar.com.educacionit.clase5.collections;

import java.util.Comparator;

public abstract class ClienteOrden implements Comparator<Cliente>{
	
	enum OrdenEnum  {
		ASC("asc"), 
		DESC("desc"), 
		DEFECTO("def"),
		SALDOASC("saldo-asc"),
		SALDODESC("saldo-desc");
		
		private String value;
		private OrdenEnum(String value){
			this.value = value;
		}
		public String getValue() {
			return this.value;
		}
	};
}
