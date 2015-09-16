package br.com.logusinfo;

import java.io.File;

public class Contador {
	
	private String pasta;
	private int length;

	private Contador() {}
	
	public Contador(String pasta) {
		super();
		this.pasta = pasta;
		QtdArquivos();
	}

	public void QtdArquivos() {

		File arquivo = new File(pasta);
		// Carrega todos os arquivos em um vetor // apt-get update && upgrade
		File[] arquivos = arquivo.listFiles();

		int dir = 0;

		// Se há arquivos, entra nesta rotina
		if (arquivos != null) {
			length = arquivos.length;

			for (int i = 0; i < length; ++i) {
				File f = arquivos[i];
				if (f.isFile()) {
					dir++;
				}

			}
			
			System.out.println("Quantidade de Diretorios: " + length);

		}
		
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getPasta() {
		return pasta;
	}

	public void setPasta(String pasta) {
		this.pasta = pasta;
	}

}
