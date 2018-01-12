package ciudad;

public class Trabajador extends Persona{

	private double sueldo;

	
	public Trabajador(){
		
	}
	
	public Trabajador(String nombre){
		super.setNombre(nombre);
		
		
	}
	
	public Trabajador(String nombre, String dni){
		super.nombre = nombre;
		super.dni = dni;
		//super(nombre, dni);
		
	}
	public Trabajador(String nombre, String dni, double sueldo){
		super(nombre, dni);
		this.sueldo = sueldo;
	}
	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void trabajar(int horas){
		System.out.println("Hoy trabajo " + horas + " horas");
	}
	
	public void mostrarInfo(){
		super.mostrarInfo();
		System.out.println(this.sueldo);
	}
	
}
