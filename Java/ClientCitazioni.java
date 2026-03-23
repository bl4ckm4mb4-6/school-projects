package esercizi;

import java.io.*;
import java.net.*;

public class ClientCitazioni {

	public static void main(String[] args) {
		Socket connessione;
		String server = "localhost";
		int porta = 3333;
		InputStream inS;
		InputStreamReader inR;
		InputStreamReader inUtente = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(inUtente);
		BufferedReader buffer;
		OutputStream out;
		PrintWriter writer;
		try {
			connessione = new Socket(server,porta);
			System.out.println("Connessione aperta");
			out = connessione.getOutputStream();
			writer = new PrintWriter(out);
			System.out.println("Inserisci numero della citazione(1 a 5): ");
			String num = tastiera.readLine();
			writer.println(num);
			writer.close();
			connessione.close();
			
			connessione = new Socket(server,porta);
			inS = connessione.getInputStream();
			inR = new InputStreamReader(inS);
			buffer = new BufferedReader(inR);
			String citazione;
			citazione = buffer.readLine();
			System.out.println("Citazione motivazionale: "+citazione);
			buffer.close();
			connessione.close();
			System.out.println("Connessione chiusa");
		}catch(IOException ioe) {
			System.err.println("Connessione fallita: "+ioe);
		}
		
	}

}
