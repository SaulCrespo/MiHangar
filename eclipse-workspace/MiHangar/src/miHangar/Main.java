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
			} catch (NumberFormatException e) {
				System.out.println("Opción no válida.");
			} catch (IOException e) {
				System.out.println("Ha habido un error.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (opcion != 0);
	}

	private static Nave eliminarNave(Map<String, Nave> misNaves, BufferedReader br) throws Exception {
		System.out.print("Introduzca la matricula de la nave que desea eliminar: ");
		String matricula = br.readLine();
		if(misNaves.keySet().contains(matricula)) {
			return misNaves.remove(matricula);
		} else {
			throw new Exception("La nave no se encuentra en el hangar");
		}
		
	}

	private static String listarNaves(Map<String, Nave> misNaves) {
		String temp = "Lista de naves:";
		for (String s: misNaves.keySet()) {
			temp += "\n" + misNaves.get(s);
		}
		return temp;
	}

	private static void addNave(Map<String, Nave> lista, BufferedReader br) throws IOException {
		String[] data = new String[2];
		boolean run = true;
		System.out.print("Introduzca matricula de la nave: ");
		data[0] = br.readLine();
		System.out.print("Introduzca flota de la nave: ");
		data[1] = br.readLine();
		while (run) {
			try {
				System.out.println("Introduzca tipo de nave: ");
				switch(br.readLine().toLowerCase().charAt(0)) {
					case 'w' -> {
						System.out.print("Introduzca numero de motores: ");
						
						lista.put(data[0], new Wing(data[0], data[1].startsWith("s"), Integer.parseInt(br.readLine())));
						run = false;
					}
					case 't' -> {
						System.out.print("Introduzca Cilindrada: ");
						lista.put(data[0], new Tie(data[0], data[1].startsWith("s"), Float.parseFloat(br.readLine())));
						run = false;
					}
					default -> System.out.println("Tipo de nave no reconocida.");
				}
				
			} catch (Exception e) {
				System.out.println("Ha habido un error.");
			}
		}
	}
}
