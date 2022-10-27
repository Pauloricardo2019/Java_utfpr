
//Paulo Ricardo RA:2145332
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura {

	public String entDados(String label) {

		System.out.println(label);
		String resp = "";

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);

		try {
			resp = buff.readLine();
		} catch (IOException ioe) {
			System.out.println("\nERRO");
		}
		return resp;
	}

}// fim da classe
