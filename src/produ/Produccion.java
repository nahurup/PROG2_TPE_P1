package produ;
import produ.criterios.Criterio;
import java.util.ArrayList;

public class Produccion {
	//Atributos
	private ArrayList<Participante> participantes;
	
	//Constructor
	
	
	//Metodos
    public ArrayList<Participante> buscar(Criterio criterio){
        ArrayList<Participante> losQueCumplen = new ArrayList();
        for (Participante p: participantes) //foreach
            if (criterio.cumple(p))
                losQueCumplen.add(p);
        return losQueCumplen;
    }
}
