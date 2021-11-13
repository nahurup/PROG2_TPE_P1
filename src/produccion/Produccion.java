package produccion;
import java.util.ArrayList;

public class Produccion {
	//Atributos
	private ArrayList<Coach> jurados;
	private ArrayList<TemaMusical> cancionesDisponibles;
	
	public Produccion () {
		this.jurados = new ArrayList<>();
		this.cancionesDisponibles = new ArrayList<>();
	}
	
	public void addJurado (Coach jurado) {
		if (!this.jurados.contains(jurado)) {
			this.jurados.add(jurado);
		}
	}
	
	public ArrayList<Coach> getJurados () {
		ArrayList<Coach> copia = new ArrayList<>(this.jurados);
		return copia;
	}
	
	public void addCancion (TemaMusical temaMusical) {
		if (!this.cancionesDisponibles.contains(temaMusical)) {
			this.cancionesDisponibles.add(temaMusical);
		}
	}
	
	public ArrayList<TemaMusical> getCanciones () {
		ArrayList<TemaMusical> copia = new ArrayList<>(this.cancionesDisponibles);
		return copia;
	}
}
