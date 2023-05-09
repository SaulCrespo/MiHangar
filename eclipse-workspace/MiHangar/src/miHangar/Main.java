package miHangar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, Nave> misNaves = new HashMap<>();
		int opcion = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.println("Introduzca la opción deseada:\n" +
					"1) Añadir nave\n" +
					"2) Eliminar nave\n" +
					"3) Ver naves\n" +
					"4) Salir");
			try {
				opcion = Integer.parseInt(br.readLine());
			} catch (NumberFormatException  | IOException e) {
				System.out.println("Opción no válida");
			}
			
		} while (opcion != 0);
	}
}
