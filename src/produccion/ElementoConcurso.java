package produccion;

import java.util.ArrayList;

import produccion.criterios.Criterio;

public abstract class ElementoConcurso {

	protected String nombre;
	
	public ElementoConcurso (String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int getEdad ();
	public abstract ArrayList<String> getGeneros();
	public abstract ArrayList<String> getIdiomas();
	public abstract ArrayList<String> getInstrumentos();
	public abstract ArrayList<ElementoConcurso> busqueda (Criterio C);
	
	public Boolean contieneGenero (String genero) {
		if (this.getGeneros().contains(genero)) {
			return true;
		}
		else {
			return false;
		}
	}
	public Boolean contieneIdioma (String idioma) {
		if (this.getIdiomas().contains(idioma)) {
			return true;
		}
		else {
			return false;
		}
	}
	public Boolean contieneInstrumento (String instrumento) {
		if (this.getInstrumentos().contains(instrumento)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}
