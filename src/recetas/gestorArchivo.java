package recetas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class gestorArchivo {

	public Cocinero gestionarIn(String path) throws FileNotFoundException {
		File archivo = new File(path);
		Scanner lectura = new Scanner(archivo);
		Cocinero chefcito = new Cocinero();
		int cantHeladera = lectura.nextInt();
		int cantReceta = lectura.nextInt();
		for (int i = 0; i < cantHeladera; i++) {
			chefcito.getHeladera().agregarIngrediente(lectura.next());
		}
		for (int i = 0; i < cantReceta; i++) {
			chefcito.getReceta().agregarIngrediente(lectura.next());
		}

		lectura.close();
		return chefcito;
	}

	public void generarOut(String path, int cant, List<String> faltantes) throws IOException {
		FileWriter archivo = null;
		PrintWriter pw = null;

		try {
			archivo = new FileWriter(path);
			pw = new PrintWriter(archivo);

			pw.println(cant);
			pw.print("ingredientes faltantes: " + faltantes);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (archivo != null)
				archivo.close();
		}
	}
}
