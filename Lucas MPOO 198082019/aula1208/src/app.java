package src;

public class app {
	public static void main(String[] args) {
		//alocação de memória em Java é dinâmica
		//acesso da mémoria em C é direto, em Java é indireto.
		
		// modificar os dias por date
		Fruta fruta = new Fruta("maçã", true, 5); 		//método construtor?
		Fruta fruta2 = new Fruta("goiaba", true, 9);
		Fruta fruta3 = new Fruta("coco", false, 30);

		
		//quando não se da nome a variavel diz-se: objeto anônimo
		
		
		// boa prática de programação o nome do objeto é o mesmo nome da classe
		System.out.println(fruta.nome);
		System.out.println(fruta2.nome);
		
		
		
	}

}
