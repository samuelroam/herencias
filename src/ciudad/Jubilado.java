package ciudad;

public class Jubilado extends Persona{

	private double sueldo;

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
	
	public void pasear(int km){
		System.out.println("He paseado " + km + " km");
	}

}
