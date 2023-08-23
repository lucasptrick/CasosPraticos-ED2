package Atividade2;

public class Pedido {
	private String nome;
	private String descricao;
	
	public Pedido(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}	
}

