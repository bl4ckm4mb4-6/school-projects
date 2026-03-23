package esercizi;

import java.io.*;
import java.net.*;

public class ServerCitazioni {

	
	public static void main(String[] args) {
		String[] citazioni = new String[5];
		citazioni[0] = "Non mollare";
		citazioni[1] = "Dai che ce la fai";
		citazioni[2] = "Continua per la tua strada";
		citazioni[3] = "Fischia!";
		citazioni[4] = "Germano Mosconi";
		int count=0;
		ServerSocket server;
		Socket connessione;
		int porta = 3333;
		OutputStream out;
		PrintWriter sOut;
		InputStream in;
		InputStreamReader reader;
		BufferedReader buffer;
		try {
			server = new ServerSocket(porta);
			while(true) {
				System.out.println("In attesa di connessioni...");
				connessione = server.accept();
				System.out.println("Connessione stabilita.");
				count++;
				System.out.println("Connessione numero: "+count);
				in = connessione.getInputStream();
				reader = new InputStreamReader(in);
				buffer = new BufferedReader(reader);
				String line = buffer.readLine();
				buffer.close();
				connessione.close();
				
				connessione = server.accept();
				out = connessione.getOutputStream();
				sOut = new PrintWriter(out);
				int num = Integer.parseInt(line);
				switch(num) {
				case 1:
					sOut.println(citazioni[0]);
					break;
				case 2:
					sOut.println(citazioni[1]);
					break;
				case 3:
					sOut.println(citazioni[2]);
					break;
				case 4:
					sOut.println(citazioni[3]);
					break;
				case 5:
					sOut.println(citazioni[4]);
					break;
				default:
					sOut.println("Non esiste la citazione selezionata");
				}
				sOut.close();
				connessione.close();
				System.out.println("Connessione chiusa.");
			}
		}catch(IOException ioe) {
			System.err.println(ioe);
		}
		
	}

}
