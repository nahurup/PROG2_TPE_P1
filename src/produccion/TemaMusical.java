package produccion;
import java.util.ArrayList;
import produccion.EstrategiasTemasMusicales.Estrategia;

public class TemaMusical {
	private String titulo;
	private String idioma;
	private ArrayList<String> generos;
	private ArrayList<String> instrumentosImplementados;
	private Estrategia Estrategia;
	
	public TemaMusical (String titulo, String idioma, Estrategia estrategia) {
		this.titulo = titulo;
		this.idioma = idioma;
		this.Estrategia = estrategia;
	}
	
	public void setEstrategia (Estrategia E) {
		this.Estrategia = E;
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
	public Estrategia getEstrategia () {
		return this.Estrategia;
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
