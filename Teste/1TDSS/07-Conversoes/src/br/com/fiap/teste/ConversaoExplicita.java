package br.com.fiap.teste;

import javax.swing.JOptionPane;

public class ConversaoExplicita {
	
	//Conversao explicita pode perder informação
	public static void main(String[] args) {
		
		//Ler um numero do tipo double peso da pessoa
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));	
		
		//Converter o peso para um float
		float pesoFloat = (float) peso;
		
		//Converter o peso pra um int
		int pesoInt = (int) peso;
		
		//Exibir o pesoFloat e o pesoInt
		JOptionPane.showMessageDialog(null, "Float: " + pesoFloat + " int: " + pesoInt);
		
		float altura = 1.7f; //f no final define o numero como tipo float
		
		
		int i = 10;
		short s = (short) i;
		
	}
}
