package src;

public class app {
	public static void main(String[] args) {
		//aloca��o de mem�ria em Java � din�mica
		//acesso da m�moria em C � direto, em Java � indireto.
		
		
		Fruta lucas =new Fruta("gordinho sensual", true); //m�todo construtor?
		//quando n�o se da nome a variavel diz-se: objeto an�nimo
		
		Fruta fruta1 = new Fruta("goiaba", true); //goiaba
		Fruta fruta2 = new Fruta("mam�o", false);
		
		fruta1.nome = "goiaba";
		fruta1.isClimaterica = true;
		
		// boa pr�tica de programa��o o nome do objeto � o mesmo nome da classe
		System.out.println(fruta1.nome);
		System.out.println(fruta1.isClimaterica);
		System.out.println("o nome desta fruta gostosa � " + lucas.nome);
	}

}
