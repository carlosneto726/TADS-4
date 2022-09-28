package programa2;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket cliente = new Socket("127.0.0.1", 12345);
		
		System.out.println("O cliente se conectou ao servidor!");

		Scanner teclado = new Scanner(System.in);
                
                String path = "D:\\User\\Downloads\\teste.txt";
                byte[] m = path.getBytes();
                System.out.println(m);
                
		
		PrintStream saida = new PrintStream(cliente.getOutputStream());

		while (teclado.hasNextLine()) {
			saida.println(teclado.nextLine());
		}

		saida.close();
		teclado.close();
	}
}