package Atividade2;

public class FilaPedidos {
	private No frente;
	private No traseira;
	
	public FilaPedidos() {
		this.frente = null;
		this.traseira = null;
	}
	
	boolean estaVazia() {
		return frente == null;
	}
	
	void enfileirar(Pedido pedido) {
		No novoNo = new No(pedido);
		if (estaVazia()) {
			frente = novoNo;
			traseira = novoNo;
		}else {
			traseira.proximo = novoNo;
			traseira = novoNo;
		}
	}
	Pedido desenfileirar() {
		if (estaVazia()) {
			return null;
		}else {
			Pedido pedidoRemovido = frente.pedido;
			frente = frente.proximo;
			if (frente == null) {
				traseira = null;
			}
			return pedidoRemovido;
		}
		
	}
	Pedido frentePedido() {
		if (estaVazia()) {
			return null;
		}else {
			return frente.pedido;
		}
	}
}
