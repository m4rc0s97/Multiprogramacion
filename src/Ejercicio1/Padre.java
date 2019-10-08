package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Padre {
	public static void main(String[] args) {
		try {
			ProcessBuilder pb = new ProcessBuilder("java", "-jar", "EjercicioAleatorio.jar");
			Process p = pb.start();
			PrintStream ps = new PrintStream(p.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			String sc = in.readLine();
			int lectura;

			while (!sc.equals("fin")) {
				ps.println(sc);
				ps.flush();
				System.out.println(br.readLine());
				sc = in.readLine();
			}
			p.destroy();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}