package dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import model.Pedido;

public class PedidoDAO {

	ArrayList<String> lista_pedido = new ArrayList<String>();

	/*
	 * O m�todo a seguir ir� inserir um pedido no Array e retornar�
	 * se a opera��o for bem sucedida.
	 */
	public boolean inserir(Pedido p) {
		boolean retorno = false;
		

		try {
			for(int i = 0; i < p.getQtd_camisas();i++) {

				if(lista_pedido.add(p.getMatricula()+":"+p.getTamanho()+":"+color_to_CMYK(p.getCor_CMYK()))) {					
					retorno = true;
				}
				
			}
			gerar_TXT();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return retorno;
	}
	

	public String mostrar_Primeiro_Pedido() {
		return lista_pedido.get(0);
	}
	
	
	public ArrayList<String> mostrar_Lista(){
		return lista_pedido;
	}

	/*
	 * M�todo respons�vel por receber a cor como texto
	 * e traduzi-la para o padr�o CMYK
	 */
	public String color_to_CMYK(String color){

		String CMYK = null;

		if (color.equals("Branco")){

			CMYK = "0000";	

		}
		if (color.equals("Azul")){

			CMYK = "1100";

		}
		if (color.equals("Vermelho")){

			CMYK = "0110";

		}
		if (color.equals("Verde")){

			CMYK = "1010";

		}
		if (color.equals("Amarelo")){

			CMYK = "0010";

		}					

		return CMYK;
	}
	
	public void gerar_TXT() throws IOException {
		
		/*O param�tro "true" no FileWriter � responsavel por ativar o append,
		 * ou seja, o subescrever no arquivo.txt
		 */
	    FileWriter arq = new FileWriter("src/arquivo/Pedido.txt",true);
	    PrintWriter gravarArq = new PrintWriter(arq);
	 
	    gravarArq.printf("+----Pedido----+%n");//Cabe�alho
	    
	    for (int i = 0; i < lista_pedido.size();i++) {
	      gravarArq.printf("|"+lista_pedido.get(i)+"|%n");
	    }
	    gravarArq.printf("+--------------+%n");//Rodap�
	 
	    gravarArq.close();
	    arq.close();
	    
	  
	  }
	
}
