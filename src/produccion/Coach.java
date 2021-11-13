package produccion;
import java.util.ArrayList;
import java.util.Collections;

import produccion.criterios.Criterio;

public class Coach {
	//Atributos
	private ArrayList<ElementoConcurso> equipo;
	
	//Constructor
    public Coach (){
        this.equipo = new ArrayList<>();
    }
	
    public ArrayList<ElementoConcurso> getEquipo(){
        return new ArrayList<ElementoConcurso>(equipo);
    }
    
    public void addParticipante(Participante p) {
    	if(!equipo.contains(p)) {
    		equipo.add(p);
    	}
    }
    
    public int getEdadEquipo() {
    	int sumatoriaEdad = 0;
		int totalMiembros = 0;
		for (ElementoConcurso E:equipo) {
			sumatoriaEdad += E.getEdad();
			totalMiembros++;
		}
		
		return sumatoriaEdad/totalMiembros;
    }
    
	public ArrayList<String> getListaGeneros() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		for (ElementoConcurso p: equipo) {
			ArrayList<String> aux = p.getGeneros();
			aux.removeAll(lista_temp);
			lista_temp.addAll(aux);
		}
		Collections.sort(lista_temp);
		return lista_temp;
	}
	
	public ArrayList<String> getListaIdiomas() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		for (ElementoConcurso E: equipo) {
			ArrayList<String> aux = E.getIdiomas();
			aux.removeAll(lista_temp);
			lista_temp.addAll(aux);
		}
		return lista_temp;
	}
	
	public ArrayList<String> getListaInstrumentos() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		for (ElementoConcurso E: equipo) {
			ArrayList<String> aux = E.getInstrumentos();
			aux.removeAll(lista_temp);
			lista_temp.addAll(aux);
		}
		return lista_temp;
	}
	
	public int getPromedioEdad() {
		int suma = 0;
		for (ElementoConcurso E: equipo) {
			suma += E.getEdad();
		}
		
		return (suma/this.equipo.size());
	}
    
    public ArrayList<ElementoConcurso> seleccionarParticipantes (Criterio criterio) {
    	ArrayList<ElementoConcurso> listaFiltrada = new ArrayList<>();
    	for (ElementoConcurso E:this.equipo) {
    		if (criterio.cumpleConCriterio(E)) {
    			listaFiltrada.add(E);
    		}
    		else {
    			listaFiltrada.addAll(E.busqueda(criterio));
    		}
    	}
    	return listaFiltrada;
    }
}
