package ar.com.educacionit.clase5.collections;

public class Cliente implements Comparable<Cliente> {

	private Long id;
	private String nombre;
	private Float saldo;
	
	public Cliente(Long id, String nombre, Float saldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	@Override
	public int compareTo(Cliente o1) {
		return this.getId().compareTo(o1.getId());
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", saldo=" + saldo + "]";
	}
	
	
}
