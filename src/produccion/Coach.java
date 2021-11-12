package produccion;
import java.util.ArrayList;

import produccion.criterios.Criterio;
import produccion.criterios.CriterioEdad;

public class Coach {
	//Atributos
	private ArrayList<Participante> equipo;
	
	//Constructor
    public Coach (){
        this.equipo = new ArrayList<>();
    }
	
    public ArrayList<Participante> getEquipo(){
        return new ArrayList<Participante>(equipo);
    }
    
    public void addParticipante(Participante p) {
    	if(!equipo.contains(p)) {
    		equipo.add(p);
    	}
    }
    
	public ArrayList<String> getListaGeneros() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		for (Participante p: equipo) {
			p.getGeneros().removeAll(lista_temp);
			lista_temp.addAll(p.getGeneros());
		}
		return lista_temp;
	}
	
	public ArrayList<String> getListaIdiomas() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		for (Participante p: equipo) {
			p.getIdiomas().removeAll(lista_temp);
			lista_temp.addAll(p.getIdiomas());
		}
		return lista_temp;
	}
	
	public ArrayList<String> getListaInstrumentos() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		for (Participante p: equipo) {
			p.getInstrumentos().removeAll(lista_temp);
			lista_temp.addAll(p.getInstrumentos());
		}
		return lista_temp;
	}
	
	public int getPromedioEdad() {
		int suma = 0;
		for (Participante p: equipo) {
			suma += p.getEdad();
		}
		
		return (suma/this.equipo.size());
	}
    
    public ArrayList<Participante> seleccionarParticipantes (Criterio criterio) {
    	ArrayList<Participante> listaFiltrada = new ArrayList<>();
    	for (Participante p:this.equipo) {
    		if (criterio.cumpleConCriterio(p)) {
    			listaFiltrada.add(p);
    		}
    	}
    	return listaFiltrada;
    }
}
