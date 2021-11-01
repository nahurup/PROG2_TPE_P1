package produ.criterios.CriteriosContainsString;
import produ.ElementoConcurso;
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
	public Boolean cumpleConCriterio(ElementoConcurso e) {
		if (e.getGeneros().contains(this.getPalabra())) {
			return true;
		}
		else {
			return false;
		}
	}
}