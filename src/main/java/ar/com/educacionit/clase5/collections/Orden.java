package ar.com.educacionit.clase5.collections;

import java.util.Comparator;

public abstract class Orden implements Comparator<Integer> {
	
	enum OrdenEnum  {
		ASC("asc"), 
		DESC("desc"), 
		DEFECTO("def");
		
		private String value;
		private OrdenEnum(String value){
			this.value = value;
		}
		public String getValue() {
			return this.value;
		}
	};
}
