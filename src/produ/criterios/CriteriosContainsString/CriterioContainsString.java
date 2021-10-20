package produ.criterios.CriteriosContainsString;
import produ.Participante;
import produ.criterios.Criterio;

public abstract class CriterioContainsString implements Criterio {

    private String palabraCriterio;

    public CriterioContainsString(String palabra) {
        this.palabraCriterio = palabra;
    }

    public String getPalabra() {
        return palabraCriterio;
    }
    
	@Override
	public Boolean cumpleConCriterio(Participante participante) {
		if (participante.getGeneros().contains(this.getPalabra())) {
			return true;
		}
		else {
			return false;
		}
	}
}