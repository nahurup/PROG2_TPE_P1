package produccion;

import java.util.ArrayList;

import produccion.criterios.Criterio;

public class Banda extends ElementoConcurso {

	private ArrayList<ElementoConcurso> miembros;
	
	public Banda (String nombre) {
		super(nombre);
		this.miembros = new ArrayList<>();
	}

	@Override
	public int getEdad() {
		int sumatoriaEdad = 0;
		int totalMiembros = 0;
		for (ElementoConcurso E:miembros) {
			sumatoriaEdad += E.getEdad();
			totalMiembros++;
		}
		
		return sumatoriaEdad/totalMiembros;
	}

	@Override
	public ArrayList<String> getGeneros() {
		ArrayList<String> totalGeneros = new ArrayList<>();
		
		for (ElementoConcurso E:miembros) {
			if (totalGeneros.isEmpty()) {
				totalGeneros.addAll(E.getGeneros());
			}
			else {
				totalGeneros.retainAll(E.getGeneros());
			}
		}
		return totalGeneros;
	}

	@Override
	public ArrayList<String> getIdiomas() {
		ArrayList<String> totalIdiomas = new ArrayList<>();
		
		for (ElementoConcurso E:miembros) {
			ArrayList<String> aux = E.getIdiomas();
			aux.removeAll(totalIdiomas);
			totalIdiomas.addAll(aux);
		}
		
		return totalIdiomas;
	}

	@Override
	public ArrayList<String> getInstrumentos() {
		ArrayList<String> totalInstrumentos = new ArrayList<>();
		
		for (ElementoConcurso E:miembros) {
			ArrayList<String> aux = E.getInstrumentos();
			aux.removeAll(totalInstrumentos);
			totalInstrumentos.addAll(aux);
		}
		
		return totalInstrumentos;
	}

	@Override
	public ArrayList<ElementoConcurso> busqueda(Criterio C) {
		ArrayList<ElementoConcurso> resultado = new ArrayList<>();
		//chequeamos si el cumple con lo solicitado
		if (C.cumpleConCriterio(this)) {
			resultado.add(this);
		} else {
			//si no cumple recorremos sus miembros
	    	for (ElementoConcurso E:this.miembros) {
	    		//chequeamos si el miembro banda/participante cumple con los criterios
	    		if (C.cumpleConCriterio(E)) {
	    			resultado.add(E);
	    		}
	    		//si no cumple, si es banda chequea sus miembros si es participante
	    		//en su metodo busqueda se agrega a si mismo
	    		else {
	    			resultado.addAll(E.busqueda(C));
	    		}
	    	}
		}

    	return resultado;
	}

	@Override
	public ArrayList<ElementoConcurso> getMiembros() {
		ArrayList<ElementoConcurso> copia = new ArrayList<>();
		copia.addAll(this.miembros);
		return copia;
	}
	
	
}
