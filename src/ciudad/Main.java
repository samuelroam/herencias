package ciudad;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {


		Trabajador t = new Trabajador("Mikel", "Delastortillas", "34343434i", 1300);
		t.mostrarInfo();
		
		
		ArrayList<Persona> alumno = new ArrayList();
		Persona persona = new Persona();
		persona.setNombre("Jaimito");
		persona.setApellido("Suschistes");
		persona.setDni("12345678");
		alumno.add(persona);
		
		alumno.add(new Persona("n1","a1","dni1"));
		
		
		

	}

}
