package recetas;

import java.util.HashSet;
import java.util.Set;

public class Heladera {
	private Set<String> ingredientes = new HashSet<String>();

	public void agregarIngrediente(String ingr) {
		ingredientes.add(ingr);
	}

	public Set<String> getIngHeladera() {
		return ingredientes;
	}

	public boolean estaEnLaHeladera(String ing) {
		return ingredientes.contains(ing);
	}
}
