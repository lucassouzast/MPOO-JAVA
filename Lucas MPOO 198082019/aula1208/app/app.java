package app;

import src.Fruta;

public class app {
	public static void main(String[] args) {
		//aloca��o de mem�ria em Java � din�mica
		//acesso da m�moria em C � direto, em Java � indireto.
		
		
		Fruta fruta = new Fruta("ma��"); 		//m�todo construtor?
		Fruta fruta2 = new Fruta("goiaba");
		
		//quando n�o se da nome a variavel diz-se: objeto an�nimo
		
		
		// boa pr�tica de programa��o o nome do objeto � o mesmo nome da classe
		System.out.println(fruta.nome);
		System.out.println(fruta2.nome);

	}
}
