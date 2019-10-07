package Aleatorios;
import java.util.Scanner;

public class Aleatorios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra = "";

		while (!palabra.equals("fin")) {
			palabra = sc.next();
			if (!palabra.equals("fin")) {
				int numero = (int) Math.floor((Math.random() * 10));
				System.out.println(numero);
			}
		}
	}
}
