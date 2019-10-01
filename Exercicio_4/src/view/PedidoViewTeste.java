package view;

import business.PedidoBusiness;
import model.Pedido;

public class PedidoViewTeste {
	
	PedidoBusiness pedidoBusiness = new PedidoBusiness();
	Pedido pedido = new Pedido("0012345","P","Amarelo",3);
	
	public PedidoViewTeste() {
		atendimento();
	}
	
	public void atendimento() {
		pedidoBusiness.solicitacao(pedido);
		System.out.println(pedidoBusiness.Lista());
	}
			
	public static void main(String[] args) {
		new PedidoViewTeste();
	}

}
