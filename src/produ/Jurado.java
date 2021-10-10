package produ;
import java.util.ArrayList;

import farmacia.Medicamento;

public class Jurado {
	//Atributos
	private ArrayList<Participante> equipo;
	
	//Constructor
    public Jurado(){
        this.equipo = new ArrayList<>();
    }
	
	//Metodos
    //public Participante getParticipante()
	public ArrayList<String> getListaGeneros() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		for (Participante p: equipo) {
			p.getGeneros().removeAll(lista_temp);
			lista_temp.addAll(p.getGeneros());
		}
		return lista_temp;
	}
	public ArrayList<String> getListaIdiomas() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		for (Participante p: equipo) {
			p.getIdiomas().removeAll(lista_temp);
			lista_temp.addAll(p.getIdiomas());
		}
		return lista_temp;
	}
	public ArrayList<String> getListaInstrumentos() {
		ArrayList<String> lista_temp = new ArrayList<String>();
		for (Participante p: equipo) {
			p.getInstrumentos().removeAll(lista_temp);
			lista_temp.addAll(p.getInstrumentos());
		}
		return lista_temp;
	}
	public int getPromedioEdad() {
		ArrayList<Integer> lista_edades = new ArrayList<>();
		int suma = 0;
		for (Participante p: equipo) {
			lista_edades.add(p.getEdad());
		}
		for (int i : lista_edades) {
			suma = suma + i;
		}
		
		return (suma/lista_edades.size());
	}
    public void agregarParticipante(Participante p) {
    	if(!equipo.contains(p)) {
    		equipo.add(p);
    	}
    }
}
