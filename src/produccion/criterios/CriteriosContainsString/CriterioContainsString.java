package produccion.criterios.CriteriosContainsString;
import produccion.ElementoConcurso;
import produccion.criterios.Criterio;

public abstract class CriterioContainsString implements Criterio {

    private String palabraCriterio;

    public CriterioContainsString(String palabra) {
        this.palabraCriterio = palabra;
    }

    public String getPalabra() {
        return palabraCriterio;
    }
    
	@Override
	public Boolean cumpleConCriterio(ElementoConcurso miembro) {
		if (miembro.getGeneros().contains(this.getPalabra())) {
			return true;
		}
		else {
			return false;
		}
	}
}