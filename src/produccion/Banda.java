package produccion;

import java.util.ArrayList;

public class Banda extends ElementoConcurso {

	private ArrayList<ElementoConcurso> miembros;
	
	public Banda (String nombre) {
		super(nombre);
		this.miembros = new ArrayList<>();
	}

	@Override
	public int getEdad() {
		int sumatoriaEdad = 0;
		int totalMiembros = 0;
		for (ElementoConcurso E:miembros) {
			sumatoriaEdad += E.getEdad();
			totalMiembros++;
		}
		
		return sumatoriaEdad/totalMiembros;
	}

	@Override
	public ArrayList<String> getGeneros() {
		ArrayList<String> totalGeneros = new ArrayList<>();
		
		for (ElementoConcurso E:miembros) {
			if (totalGeneros.isEmpty()) {
				totalGeneros.addAll(E.getGeneros());
			}
			else {
				totalGeneros.retainAll(E.getGeneros());
			}
		}
		return totalGeneros;
	}
	
	
}
