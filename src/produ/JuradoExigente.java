package produ;
import java.util.ArrayList;
import java.util.List;

import produ.criterios.Criterio;
import produ.criterios.CriteriosContainsString.CriterioContainsString;
import produ.criterios.CriteriosContainsString.CriterioGenero;
import produ.criterios.CriteriosContainsString.CriterioIdioma;
import produ.criterios.CriteriosContainsString.CriterioInstrumento;

public class JuradoExigente extends Coach {
	//Atributos
	private ArrayList<Criterio> listaRestricciones;
	
	//Constructor
    public JuradoExigente(){
        this.listaRestricciones = new ArrayList<>();
    }
    
    public void addRestriccion (Criterio criterio) {
    	if (!this.listaRestricciones.contains(criterio)) {
    		this.listaRestricciones.add(criterio);
    	}
    }
    
    public void limpiarListaRestricciones () {
    	this.listaRestricciones.removeAll(listaRestricciones);
    }
    
    public ArrayList<Criterio> getRestricciones () {
    	ArrayList<Criterio> copia = this.listaRestricciones;
    	return copia;
    }
	
	//Metodos
    @Override
    public void addParticipante(Participante p) {
    	int criteriosCumplidos = 0;
    	for (Criterio criterio:this.listaRestricciones) {
    		if (criterio.cumpleConCriterio(p)) {
    			criteriosCumplidos++;
    		}
    	}
    	if (criteriosCumplidos == this.listaRestricciones.size()) {
    		this.addParticipante(p);
    	}
    }
}
