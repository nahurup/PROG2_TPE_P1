package produccion;

import produccion.criterios.Criterio;

public class JuradoExigente extends Coach {
	//Atributos
	private Criterio estrategia;
	
	//Constructor
    public JuradoExigente(Criterio estrategia){
        this.estrategia = estrategia;
    }
    
    public void setEstrategia (Criterio E) {
    	this.estrategia = E;
    }
    
    public Criterio getEstrategia () {
    	return this.estrategia;
    }
	
    @Override
    public void addParticipante(Participante p) {
    	if (estrategia.cumpleConCriterio(p)) {
    		this.addParticipante(p);
    	}
    }
}
