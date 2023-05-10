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
				
				switch(opcion) {
					case 1 -> addNave(misNaves,br);
					case 2 -> listarNaves(misNaves);
					case 3 -> eliminarNave(misNaves,br);
				}
			} catch (NumberFormatException  | IOException e) {
				System.out.println("Opción no válida");
			}
			
		} while (opcion != 0);
	}

	private static Object eliminarNave(Map<String, Nave> misNaves, BufferedReader br) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object listarNaves(Map<String, Nave> misNaves) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void addNave(Map<String, Nave> lista, BufferedReader br) throws IOException {
		String[] data = new String[4];
		System.out.print("Introduzca tipo de nave: ");
		data[0] = br.readLine();
		System.out.print("Introduzca matricula de la nave: ");
		data[1] = br.readLine();
		System.out.print("Introduzca flota de la nave: ");
		data[2] = br.readLine();
		try {
			switch(data[0].toLowerCase().charAt(0)) {
				case 'w' -> {
					System.out.print("Introduzca numero de motores: ");
					data[3] = br.readLine();
					lista.put(data[1], new Wing(data[1], data[2], Integer.parseInt(data[3])));
				}
				case 't' -> {
					System.out.print("Introduzca Cilindrada: ");
					data[3] = br.readLine();
					lista.put(data[1], new Tie(data[1], data[2], Float.parseFloat(data[3])));
				}
				default -> System.out.println("Tipo de nave no reconocida.");
			}
		} catch (Exception e) {
			System.out.println("Ha habido un error.");
		}
		
		
	
	}
}
