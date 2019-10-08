package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Aleatorios {

	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			BufferedReader br = new BufferedReader(isr);

			while (br.readLine() != null) {
				int randomNum = (int) (Math.random() * 10);
				System.out.println(randomNum);
			}
			osw.close();
			isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}