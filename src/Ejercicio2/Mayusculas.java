package Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Mayusculas {

	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			BufferedReader br = new BufferedReader(isr);
			String str = br.readLine();

			while (!str.equals("fin")) {
				System.out.println(str.toUpperCase());
				str = br.readLine();

			}
			osw.close();
			isr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}