package produccion;

import java.util.ArrayList;

public abstract class ElementoConcurso {

	protected String nombre;
	
	public ElementoConcurso (String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int getEdad ();
	public abstract ArrayList<String> getGeneros();
}
