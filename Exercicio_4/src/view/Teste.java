package view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Teste {
	
	public Teste() {
		try {
			gerar_TXT();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void gerar_TXT() throws IOException {
		
	    int i, n = 2;
	 
	 
	    FileWriter arq = new FileWriter("src/arquivo/test.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	 
	    gravarArq.printf("+----PEDIDO----+%n");
	    for (i=1; i<=10; i++) {
	      gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
	    }
	    gravarArq.printf("+--------------+%n");
	 
	    arq.close();
	 
	    System.out.printf("\nTabuada do %d foi gravada com sucesso.\n", n);
	  }
	
	public static void main(String[] args) {
		new Teste();
	}
	
}
