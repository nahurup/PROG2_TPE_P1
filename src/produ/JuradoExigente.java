package produ;
import java.util.ArrayList;

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
    public void agregarParticipante(Participante p, String instrumento, String idioma, String genero) {
    	if(!equipo.contains(p)) {
    		
        	Criterio crit_instrumento = new CriterioInstrumento(instrumento);
        	Criterio crit_idioma = new CriterioIdioma(idioma);
        	Criterio crit_genero = new CriterioGenero(genero);
        	
        	if (crit_instrumento.cumple(p) && crit_idioma.cumple(p) && crit_genero.cumple(p)) {
        		equipo.add(p);
        	} else {
        		System.out.println("No cumple requisitos.");
        	}
        	
    	}
    }
}
