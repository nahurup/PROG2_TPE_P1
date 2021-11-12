package produccion;
import java.util.ArrayList;

public class Produccion {
	//Atributos
	private ArrayList<Coach> jurados;
	private ArrayList<Cancion> cancionesDisponibles;
	
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
	
	public void addCancion (Cancion cancion) {
		if (!this.cancionesDisponibles.contains(cancion)) {
			this.cancionesDisponibles.add(cancion);
		}
	}
	
	public ArrayList<Cancion> getCanciones () {
		ArrayList<Cancion> copia = new ArrayList<>(this.cancionesDisponibles);
		return copia;
	}
}
