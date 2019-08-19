package src;

public class app {
	public static void main(String[] args) {
		//alocação de memória em Java é dinâmica
		//acesso da mémoria em C é direto, em Java é indireto.
		
		
		Fruta lucas =new Fruta("gordinho sensual", true); //método construtor?
		//quando não se da nome a variavel diz-se: objeto anônimo
		
		Fruta fruta1 = new Fruta("goiaba", true); //goiaba
		Fruta fruta2 = new Fruta("mamão", false);
		
		fruta1.nome = "goiaba";
		fruta1.isClimaterica = true;
		
		// boa prática de programação o nome do objeto é o mesmo nome da classe
		System.out.println(fruta1.nome);
		System.out.println(fruta1.isClimaterica);
		System.out.println("o nome desta fruta gostosa é " + lucas.nome);
	}

}
