package actividadesRepaso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A4_ExtraccioMails {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Ficheros
		Scanner mails = new Scanner(new File("Mails.txt"));
		PrintWriter mailsRescatados = new PrintWriter("MailsRescatados.txt");

		// Leo mientras tenga algo que leer
		while(mails.hasNext()) {
			
			// Guardo la palabra en un String
			String token = mails.next();
			
			//Miro si tiene @
			if(token.indexOf('@') > 0) {

				// Miro si tiene punto
				if(token.indexOf('.') > 0 && token.indexOf('.') != (token.indexOf('@') + 1) ) {

					// Miro si tiene extension
					if(token.length() > token.indexOf('.') + 1) {

						// Lo guardo en el fichero
						mailsRescatados.println(token);
					}
				}
			}
		}
		
		// Guardo el archivo
		mailsRescatados.close();

	}

}
