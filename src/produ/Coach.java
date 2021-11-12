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
    
    //hagamos que ordene su propia lista, no que ordene un aux y devuelva eso
    //ya que los comparadores son la forma de ganar, le decimos que ordene
    //con el comparador que va a ser usado como forma de ganar
    public void ordernarFormaGanar(Comparator<ElementoConcurso> orden) {
    	this.equipo.sort(orden);
    }
    
    //public Participante getParticipante()
	public ArrayList<String> getListaGeneros(Comparator<String> orden) {
		ArrayList<String> lista_temp = new ArrayList<String>();
		ArrayList<String> aux = new ArrayList<String>();
		for (ElementoConcurso e: equipo) {
			aux = e.getGeneros();
			aux.removeAll(lista_temp);
			lista_temp.addAll(aux);
		}
		
		lista_temp.sort(orden);
		
		return lista_temp;
	}
	
	public ArrayList<String> getListaIdiomas() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		ArrayList<String> aux = new ArrayList<String>();
		for (ElementoConcurso e: equipo) {
			aux = e.getIdiomas();
			aux.removeAll(lista_temp);
			lista_temp.addAll(aux);
		}
		return lista_temp;
	}
	
	public ArrayList<String> getListaInstrumentos() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		ArrayList<String> aux = new ArrayList<String>();
		for (ElementoConcurso e: equipo) {
			aux = e.getInstrumentos();
			aux.removeAll(lista_temp);
			lista_temp.addAll(aux);
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
