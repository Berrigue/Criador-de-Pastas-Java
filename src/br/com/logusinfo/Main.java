package br.com.logusinfo;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Scanner;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
		// todo codigo aqui
		String nomeDiretorio;
		System.out.print("Digite o caminho: ");
		nomeDiretorio = entrada.nextLine();
		
		Contador contador = new Contador(nomeDiretorio);
		
		System.out.println("Tentando criar um novo diretorio...");
		
		Pasta pasta = new Pasta();
		int quantidade = contador.getLength();
		pasta.criaDiretorio(getDateForm() + "_" + (++quantidade), nomeDiretorio);
		
		return;
	}

	public static String getDateForm(){
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date(); 
		return dateFormat.format(date);

	}
}
