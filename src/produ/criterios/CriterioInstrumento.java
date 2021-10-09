package produ.criterios;

import produ.Participante;

public class CriterioInstrumento extends Criterio {
    private String instrumento;

    public CriterioInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public boolean cumple(Participante p) {
        return p.tieneInstrumento(instrumento);
    }
}