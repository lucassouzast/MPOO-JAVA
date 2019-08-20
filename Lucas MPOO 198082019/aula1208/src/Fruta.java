package src;

import java.util.Date;

public class Fruta {
	/*
	 *  O que deve conter uma classe?	
	 * 
	 * 
	 */
	public String nome; // atributo
	public boolean isClimaterica; // atributo
	public int data; // transformar em data

	public Fruta(String nome, boolean isClimaterica, int data){ // metodo
		this.nome = nome;
		this.isClimaterica = isClimaterica;
		this.data = data;
	}
		/*
		   o que é o this?
		   serve para diferenciar variavel local de atributo variavel global
		   referencia um objeto em tempo de execução vulgo objeto corrente.
		 */                      
 	//uma vez criado o construtor o default deixa de existir 


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public boolean isClimaterica() {
		return isClimaterica;
	}


	public void setClimaterica(boolean isClimaterica) {
		this.isClimaterica = isClimaterica;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}
	
}
