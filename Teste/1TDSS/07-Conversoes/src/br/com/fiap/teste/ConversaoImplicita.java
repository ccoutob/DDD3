package br.com.fiap.teste;

import javax.swing.JOptionPane;

public class ConversaoImplicita {

	public static void main(String[] args) {
		
		//Ler a populacao de uma cidade
		int populacao = Integer.parseInt(JOptionPane.showInputDialog("Qual a população de Bauru?"));
		
		//Quais tipos de variaveis é possivel colocar a população?
		float populacaoFloat = populacao;
		double populacaoDouble = populacao;
		long populacaoLong = populacao;
		
		
		//Não funciona!!!
		//short populacaoShort = populacao;
		//populacaoFloat = populacaoDouble;
		
		//Exibir a populaçao
		JOptionPane.showMessageDialog(null, "A população de Bauru é de: " + populacao + " Pessoas");
	}
}
