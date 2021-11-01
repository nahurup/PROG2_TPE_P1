package produ;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import produ.criterios.Criterio;

public abstract class ElementoConcurso {

    public abstract ArrayList<Participante> participantesCon(Criterio cr);
    
    public abstract ArrayList<String> getGeneros();
    public abstract ArrayList<String> getIdiomas();
    public abstract ArrayList<String> getInstrumentos();
    public abstract int getEdad(); 
    public abstract ElementoConcurso copia();
    public abstract ElementoConcurso copia(Criterio condicion);

    public ArrayList<Participante> participantesCon(Criterio cr, Comparator<Participante> c) {
        ArrayList temp = this.participantesCon(cr);
        Collections.sort(temp, c);
        return temp;
    }


}
