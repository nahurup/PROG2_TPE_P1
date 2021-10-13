package produ;
import java.util.ArrayList;
import java.util.List;

import produ.criterios.Criterio;
import produ.criterios.CriterioGenero;
import produ.criterios.CriterioIdioma;
import produ.criterios.CriterioInstrumento;

public class JuradoExigente extends Jurado {
	//Atributos
	private ArrayList<Participante> equipo;
	
	//Constructor
    public JuradoExigente(){
        super();
    }
	
	//Metodos
    public void agregarParticipante(Participante p, Criterio criterio) {
    	
    	if(!equipo.contains(p)) {
        	List<Participante> resultado = new ArrayList<>();
        	resultado.add(p);
        	resultado = criterio.filter(resultado);
        	
        	if(resultado.contains(p)) {
        		equipo.add(p);
        	}else {
        		System.out.println("No cumple requisitos.");
        	}

    	}
    	
    }
}
