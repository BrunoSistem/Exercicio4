package business;

import java.util.ArrayList;

import dao.PedidoDAO;
import model.Pedido;

public class PedidoBusiness {

	private PedidoDAO pedidoDAO = new PedidoDAO();
	
	//Construtor
	public PedidoBusiness() {
		//abrir_txt();
	}
	
	//M�todo para fazer a solicita��o
	public boolean solicitacao(Pedido p) {

		if(this.pedidoDAO.inserir(p)) {
			System.out.println("inserido com sucesso!");
			return true;
		}
		System.out.println("Falha na inser��o!");
		return false;
	}
	
	//M�todo para mostrar a lista do pedido	
	public ArrayList<String> Lista(){
		return pedidoDAO.mostrar_Lista();
	}
	
	public void abrir_txt() {
		
		/*
		 * File file = new File("C:/Pedido.txt");
        	try {
            	Scanner arq = new Scanner(file);
            	while (arq.hasNextLine()) {
                String linha = arq.nextLine();
                System.out.println(linha);
            }
            arq.close();
        	} catch (IOException ioe) {
            	ioe.printStackTrace();
        	}
		 */

	}
	
	public static void main(String[] args) {
		new PedidoDAO();

	}


}
