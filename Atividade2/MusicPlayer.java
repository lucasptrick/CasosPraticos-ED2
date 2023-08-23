package Atividade2;

import java.util.LinkedList;

public class MusicPlayer {
	private LinkedList<Music> playlist;
	private int indiceAtual;
	public MusicPlayer() {
		playlist = new LinkedList<>();
		indiceAtual = 0;
	}
	void adicionarMusica(Music musica) {
		playlist.add(musica);
	}
	void listarMusic() {
		int i = 1;
		for (Music music : playlist) {
			System.out.println(i+". "+music.getNome()+" - "+music.getArtista());
			i++;
		}
	}
	void tocar() {
		if(indiceAtual < playlist.size()) {
			Music atualMusic = playlist.get(indiceAtual);
			System.out.println("Tocando: "+atualMusic.getNome()+" - "+atualMusic.getArtista());
		}else {
			System.out.println("Fim da playlist.");
			indiceAtual = 0;
		}
	}
	void pausar() {
		System.out.println("Música pausada.");
	}
	void proxMusica () {
		if (indiceAtual < playlist.size()) {
			indiceAtual++;
			tocar();
		}else {
			System.out.println("Fim da playlist.");
			indiceAtual = 0;
		}
	}
	void voltarMusica() {
		if (indiceAtual > 0) {
			indiceAtual--;
			tocar();
		}else {
			System.out.println("Início da playlist.");
			indiceAtual = 0;
		}
	}
	public LinkedList<Music> getPlaylist() {
		return playlist;
	}
	public void setPlaylist(LinkedList<Music> playlist) {
		this.playlist = playlist;
	}
	public int getIndiceAtual() {
		return indiceAtual;
	}
	public void setIndiceAtual(int indiceAtual) {
		this.indiceAtual = indiceAtual;
	}
	
}
