package recetas;

import java.util.HashSet;
import java.util.Set;

public class Receta {
	private Set<String> ingredientesR = new HashSet<String>();

	public void agregarIngrediente(String ingr) {
		ingredientesR.add(ingr);
	}

	public Set<String> getIngReceta() {
		return ingredientesR;
	}
}
