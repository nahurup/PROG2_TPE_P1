package produ;
import java.util.ArrayList;

import produ.criterios.Criterio;

public class JuradoExigente extends Jurado {
	//Atributos
	private ArrayList<Participante> equipo;
	
	//Constructor
    public JuradoExigente(){
        super();
    }
	
	//Metodos
    public void agregarParticipante(Participante p, Criterio criterio) {
    	if(!equipo.contains(p) && criterio.cumple(p)) {
    		equipo.add(p);
    	}
    }
}
