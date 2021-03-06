package produ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import produ.criterios.Criterio;

public class Banda extends ElementoConcurso {
    private String nombre;

    private ArrayList<ElementoConcurso> elementos;

    public Banda(String nombre){
        this.nombre = nombre;
        elementos = new ArrayList<>();
    }

    public void add(ElementoConcurso e){
        if (!elementos.contains(e))
            elementos.add(e);
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
	public boolean cumpleCon(Criterio cr) {
    	for (ElementoConcurso e: elementos) {
    		if (!e.cumpleCon(cr))
    			return false;
    	}
    	
    	return true;
	}
    
	@Override
	public ArrayList<String> getGeneros() {
		boolean first = true;
		ArrayList<String> generosPreferencia = new ArrayList<>();
		//los generos de preferencia se calculan como la intersección
		//de los generos de preferencia de todos su miembros
		for (ElementoConcurso e: elementos) {
			if (first) {
				generosPreferencia.addAll(e.getGeneros());
				first = false;
			} else {
				//elimina todos los elementos de la lista que no le indiquemos en la 
				//colección que pasamos como parámetro al método
				generosPreferencia.retainAll(e.getGeneros());
			}
		}
		
		return generosPreferencia;
	}
	
	@Override
	public ArrayList<String> getIdiomas() {
		//los idiomas que puede interpretar la banda se considera la unión
		//de los idiomas de todos sus miembros (sin repetidos)
		ArrayList<String> idiomasPreferencia = new ArrayList<>();
		ArrayList<String> aux = new ArrayList<>();
		for (ElementoConcurso e: elementos) {
			aux = e.getIdiomas();
			aux.removeAll(idiomasPreferencia);
			idiomasPreferencia.addAll(aux);
		}
		
		return idiomasPreferencia;
	}
	
	@Override
	public ArrayList<String> getInstrumentos() {
		//los instrumentos que puede interpretar la banda se considera la unión
		//de los instrumentos de todos sus miembros (sin repetidos)
		ArrayList<String> instrumentosPreferencia = new ArrayList<>();
		ArrayList<String> aux = new ArrayList<>();
		for (ElementoConcurso e: elementos) {
			aux = e.getInstrumentos();
			aux.removeAll(instrumentosPreferencia);
			instrumentosPreferencia.addAll(aux);
		}
		
		return instrumentosPreferencia;
	}
    
	@Override
	public int getEdad() {
		int edad = 0;
		for (ElementoConcurso e: elementos) {
			edad += e.getEdad();
		}
		
		edad = edad/this.elementos.size();
		
		return edad;
	}

    @Override
    public ArrayList<ElementoConcurso> participantesCon(Criterio cr) {
        ArrayList<ElementoConcurso> participantesCon = new ArrayList<>();
        for (ElementoConcurso e: elementos) {
        	if(cr.cumpleConCriterio(this)) {
        		//si banda o grupo cumple con lo que busca el jurado, se retorna la banda
        		participantesCon.add(this);
        	} else {
        		//si no cumple, se buscan posibles miembros de la banda que si cumplan
                participantesCon.addAll(e.participantesCon(cr));
        	}
        }
        return participantesCon;
    }

    @Override
    public ElementoConcurso copia() {
        Banda copia = new Banda(this.getNombre());
        for (ElementoConcurso e:elementos)
            copia.add(e.copia());
        return copia;
    }

    public boolean tieneElementos(){
        return !elementos.isEmpty();
    }
    @Override
    public ElementoConcurso copia(Criterio cr) {
        Banda copia = new Banda(this.getNombre());
        for (ElementoConcurso e:elementos) {
            ElementoConcurso copiaHijo = e.copia(cr);
            if (copiaHijo!=null)
                copia.add(e.copia(cr));
        }
        if (copia.tieneElementos())
            return copia;
        else
            return null;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Banda banda = (Banda) obj;
            return this.getNombre().equals(banda.getNombre());
        } catch(Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Banda{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
