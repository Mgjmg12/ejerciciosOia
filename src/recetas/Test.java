package recetas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws IOException {
		String path = "entrada.in";
		gestorArchivo arch = new gestorArchivo();
		List<String> faltantes = new ArrayList<String>();
		int cant;
		try {
			Cocinero chef = arch.gestionarIn(path);
			cant = chef.calcular(faltantes);
			arch.generarOut("entrada.out", cant, faltantes);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
