package produ;
import java.util.ArrayList;

public class Cancion {
	private String titulo;
	private String idioma;
	private ArrayList<String> generos;
	private ArrayList<String> instrumentosImplementados;
	
	public Cancion (String titulo, String idioma) {
		this.titulo = titulo;
		this.idioma = idioma;
	}
	
	public void addGenero (String genero) {
		this.generos.add(genero);
	}
	public void addInstrumento (String instr) {
		this.instrumentosImplementados.add(instr);
	}
	
	public String getTitulo () {
		return this.titulo;
	}
	public String getIdioma () {
		return this.idioma;
	}
	public ArrayList<String> getGeneros () {
		ArrayList<String> copia = new ArrayList<>(this.generos);
		return copia;
	}
	public ArrayList<String> getInstrumentos () {
		ArrayList<String> copia = new ArrayList<>(this.instrumentosImplementados);
		return copia;
	}
	
}
