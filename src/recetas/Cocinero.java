package recetas;

import java.util.List;

public class Cocinero {
	private Heladera heladera = new Heladera();
	private Receta receta = new Receta();

	public Heladera getHeladera() {
		return heladera;
	}

	public Receta getReceta() {
		return receta;
	}

	public int calcular(List<String> faltantes) {
		Object[] ingReceta = receta.getIngReceta().toArray();
		int cantFaltantes = 0;
		for (int i = 0; i < ingReceta.length; i++) {
			if (!heladera.estaEnLaHeladera((String) ingReceta[i])) {
				cantFaltantes++;
				faltantes.add((String) ingReceta[i]);
			}
		}
		return cantFaltantes;
	}

}
