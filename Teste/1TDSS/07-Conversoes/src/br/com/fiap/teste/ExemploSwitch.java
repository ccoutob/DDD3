package br.com.fiap.teste;

import javax.swing.JOptionPane;

public class ExemploSwitch {

	public static void main(String[] args) {
		//Ler umaa opcao
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero"));
		
		//Ler uma opcao: 1 - Somar, 2 - Subtrair, 3 - Multipllicar, 4 - Dividir
		int op = Integer.parseInt(JOptionPane.showInputDialog("Digite:  \n1-Somar  \n2-Subtrair  \n3-Multiplicar  \n4-Dividir"));
		
		//Realizar a opcao escolhida
		
		switch (op) {
		case 1:
			JOptionPane.showMessageDialog(null, "A soma dos números é de: " + (n1 + n2));
			break; 
		case 2: 
			JOptionPane.showMessageDialog(null, "A subtração dos números é de: " + (n1 - n2));
			break;
		case 3: 
			JOptionPane.showMessageDialog(null, "A multiplicação dos números é de: " + (n1 * n2));
			break;
		case 4: 
			JOptionPane.showMessageDialog(null, "A divisão dos números é de: " + (n1 / n2));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida");
		}
			
	}
}
