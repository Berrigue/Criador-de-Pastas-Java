package br.com.logusinfo;

import java.io.File;

public class Pasta {

	public void criaDiretorio(String novoDiretorio, String nomeDiretorio) {
		
		try {
		 	nomeDiretorio = nomeDiretorio + novoDiretorio;
			if (!new File(nomeDiretorio).exists()) { // Verifica se o diretório existe.
														
				(new File(nomeDiretorio)).mkdir(); // Cria o diretório
				System.out.println( "Novo diretorio criado em: " +nomeDiretorio);

			} else {
				System.out.println("Diretorio já existe!");
				new File(nomeDiretorio).mkdir();
			}

		} catch (Exception ex) {
			System.out.println( "Erro ao criar o diretório" );
		}
	}
	
}

