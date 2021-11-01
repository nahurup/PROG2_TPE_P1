package produ;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import produ.criterios.Criterio;

public abstract class ElementoConcurso {

    public abstract ArrayList<ElementoConcurso> participantesCon(Criterio cr);
    
    public abstract ArrayList<String> getGeneros();
    public abstract ArrayList<String> getIdiomas();
    public abstract ArrayList<String> getInstrumentos();
    public abstract boolean cumpleCon(Criterio condicion);
    public abstract int getEdad(); 
    public abstract ElementoConcurso copia();
    public abstract ElementoConcurso copia(Criterio condicion);

    public ArrayList<ElementoConcurso> participantesCon(Criterio cr, Comparator<ElementoConcurso> c) {
        ArrayList temp = this.participantesCon(cr);
        Collections.sort(temp, c);
        return temp;
    }


}
