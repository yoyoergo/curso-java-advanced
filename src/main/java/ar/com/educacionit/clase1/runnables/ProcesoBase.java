package ar.com.educacionit.clase1.runnables;

public class ProcesoBase {

	protected String nombre;
	protected boolean auditable;
	
	public ProcesoBase(String nombre, boolean auditable) {	
		this.nombre = nombre;
		this.auditable = auditable;
	}
	
}
