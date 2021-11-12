package produccion;
import java.util.ArrayList;
import java.util.List;

import produccion.criterios.Criterio;
import produccion.criterios.CriteriosContainsString.CriterioContainsString;
import produccion.criterios.CriteriosContainsString.CriterioGenero;
import produccion.criterios.CriteriosContainsString.CriterioIdioma;
import produccion.criterios.CriteriosContainsString.CriterioInstrumento;

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
    	ArrayList<Criterio> copia = new ArrayList<>(this.listaRestricciones);
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
