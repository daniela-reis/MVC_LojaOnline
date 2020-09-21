package view;

import java.util.Date;

public class PedidoView {
	public void imprimeDadosPedido(String nfe, Date data, double total, String status) {
		System.out.println("Dados Pedido: ");
		System.out.println("Nota Fiscal: " + nfe);
		System.out.println("Data da Solicitação: " + data);
		System.out.println("Valor Total: " + total);
		System.out.println("Status: " + status);
	}

}
