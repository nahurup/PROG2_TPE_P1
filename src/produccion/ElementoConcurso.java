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
	
	public Boolean puedeInterpretarTema(TemaMusical T) {
		return T.getEstrategia().cumpleConCriterio(this);
	}
}
