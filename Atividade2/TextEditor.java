package Atividade2;

import java.util.Stack;

public class TextEditor {
	private String texto;
	private Stack<String> desfazer;
	private Stack<String> refazer;
	public TextEditor() {
		texto = " ";
		desfazer = new Stack<>();
		refazer = new Stack<>();;
	}
	
	void inserirTexto(String novotexto) {
		desfazer.push(texto);
		texto += novotexto;
		refazer.clear();
	}
	
	void apagarTexto(int comprimento) {
		if (comprimento >= texto.length()) {
			desfazer.push(texto);
			texto = "";
		}else if (comprimento > 0) {
			desfazer.push(texto);
			texto = texto.substring(0,texto.length() - comprimento);
		}
		refazer.clear();
	}
	
	void desfazer() {
		if (!desfazer.isEmpty()) {
			refazer.push(texto);
			texto = desfazer.pop();
		}
	}
	
	void refazer() {
		if (!refazer.isEmpty()) {
			desfazer.push(texto);
			texto = refazer.pop();
		}
	}
	
	String pegarTexto() {
		return texto;
		
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Stack<String> getDesfazer() {
		return desfazer;
	}

	public void setDesfazer(Stack<String> desfazer) {
		this.desfazer = desfazer;
	}

	public Stack<String> getRefazer() {
		return refazer;
	}

	public void setRefazer(Stack<String> refazer) {
		this.refazer = refazer;
	}
	
}
