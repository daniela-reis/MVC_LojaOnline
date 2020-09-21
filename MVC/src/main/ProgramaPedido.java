package main;
import controller.PedidoController;
import model.Pedido;
import view.PedidoView;

public class ProgramaPedido {
	public static void main(String[] args) {
		Pedido pd = new Pedido();
		PedidoView pv = new PedidoView();
		
		PedidoController pc = new PedidoController (pd, pv);
		
		pc.updateView();
	}
}
