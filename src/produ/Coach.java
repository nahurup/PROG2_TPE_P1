package produ;
import produ.criterios.Criterio;
import produ.criterios.CriterioEdad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Coach {
	//Atributos
	private ArrayList<ElementoConcurso> equipo;
	
	//Constructor
    public Coach (){
        this.equipo = new ArrayList<>();
    }
	
    public ArrayList<ElementoConcurso> getEquipo(){
        ArrayList<ElementoConcurso> copia = this.equipo;
        
        return copia;
    }
    
    public void addParticipante(ElementoConcurso e) {
    	if(!equipo.contains(e)) {
    		equipo.add(e);
    	}
    }
    
    //public Participante getParticipante()
	public ArrayList<String> getListaGeneros(Comparator<String> orden) {
		ArrayList<String> lista_temp = new ArrayList<String>();
		for (ElementoConcurso e: equipo) {
			e.getGeneros().removeAll(lista_temp);
			lista_temp.addAll(e.getGeneros());
		}
		
		lista_temp.sort(orden);
		
		return lista_temp;
	}
	
	public ArrayList<String> getListaIdiomas() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		for (ElementoConcurso e: equipo) {
			e.getIdiomas().removeAll(lista_temp);
			lista_temp.addAll(e.getIdiomas());
		}
		return lista_temp;
	}
	
	public ArrayList<String> getListaInstrumentos() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		for (ElementoConcurso e: equipo) {
			e.getInstrumentos().removeAll(lista_temp);
			lista_temp.addAll(e.getInstrumentos());
		}
		return lista_temp;
	}
	
	public int getPromedioEdad() {
		int suma = 0;
		for (ElementoConcurso e: equipo) {
			suma += e.getEdad();
		}
		
		return (suma/this.equipo.size());
	}
    
    public ArrayList<ElementoConcurso> seleccionarParticipantes (Criterio criterio) {
    	ArrayList<ElementoConcurso> listaFiltrada = new ArrayList<>();
    	for (ElementoConcurso e: this.equipo) {
    		listaFiltrada.addAll(e.participantesCon(criterio));
    	}
    	return listaFiltrada;
    }
}
