package calcula.emprestimo;
/*Leia um salário de um trabalhador e o valor da pretação de um empréstimo.
Se prestação for maior que 20% do salário: Empréstiomo não concedido concedido.
Caso contrário imprima: Empréstimo concedido. */

import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Calcula extends Moeda {

	public Calcula(String valor) {
		super(valor);

	}

	public static void main(String[] args) {

		double salario;
		double emprestimo = 0;
		int parcelas = -1;
		double valorParcela;		
		int opcao = -1;

		salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do seu salário:"));
		JOptionPane.showMessageDialog(null, "Seu salário é: " + salario);

		int i = JOptionPane.showConfirmDialog(null, "Deseja simular um empréstimo?", null, JOptionPane.YES_NO_OPTION);
		if (i == JOptionPane.YES_OPTION) {
			JOptionPane.showInternalMessageDialog(null, "Simule seu Imprestimo.");
		} else {
			JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema!");
			System.exit(0);
		}

		while (opcao != 4) {

			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
					" <---------- MENU --------->  "
			      + "\n[1] - Digite o valor desejado "
				  + "\n[2] - Parcelas sem juros "
			      + "\n[3] - Parcelas com juros "
				  + "\n[4] - Confirmar emprestimos "
			      + "\n[5] - SAIR "));

			switch (opcao) {

			case 1:
				emprestimo = Double.parseDouble(JOptionPane.showInputDialog("Didigte o valor desejado"));
				JOptionPane.showInternalMessageDialog(null, "Valor sugerido foi: " + emprestimo);
				parcelas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite em quantas parcelas pretende pagar:"));
				JOptionPane.showMessageDialog(null, "Qantidade de parcela solicida foi: " + parcelas);
				if (parcelas <= 6) {

					valorParcela = emprestimo / parcelas;
					JOptionPane.showMessageDialog(null, "O valor da percela a ser pago é de R$" + valorParcela + " em "
							+ parcelas + " vezes sem juros!");
				}else if(parcelas >6) {
					JOptionPane.showMessageDialog(null, "Volte ao menu e solicite a opção de número [3]");
					
				}
				break;

			case 2:				
				emprestimo = Double.parseDouble(JOptionPane.showInputDialog("Didigte o valor desejado"));
				JOptionPane.showInternalMessageDialog(null, "Valor sugerido foi: " + emprestimo);
				parcelas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite em quantas parcelas pretende pagar:"));
				JOptionPane.showMessageDialog(null, "Qantidade de parcela solicida foi: " + parcelas);
				if (parcelas <= 6) {

					valorParcela = emprestimo / parcelas;
					JOptionPane.showMessageDialog(null, "O valor da percela a ser pago é de R$" + valorParcela + " em "
							+ parcelas + " vezes sem juros!");
				}else if(parcelas >6) {
					JOptionPane.showMessageDialog(null, "Volte ao menu e solicite a opção de número [3]");
					
				}				
				break;

			case 3:
				
				emprestimo = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor repita seu interesse de emprestimo:"));
				JOptionPane.showInternalMessageDialog(null, "Valor sugerido foi: " + emprestimo);
				parcelas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite em quantas parcelas pretende pagar:"));
				JOptionPane.showMessageDialog(null, "Qantidade de parcela solicida foi: " + parcelas + " vezes.");
				if (parcelas >= 7) {
					
					valorParcela = ((emprestimo * 0.2) + emprestimo )/ parcelas;					
					JOptionPane.showMessageDialog(null, "O valor da percela a ser pago é de R$" + valorParcela + " em "	+ parcelas);
				}				
				break;

			case 4:
				
				salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do seu salário:"));
				JOptionPane.showMessageDialog(null, "Seu salário é: " + salario);
				
				
				
				break;

			case 5:

				int s = JOptionPane.showConfirmDialog(null, "Deseja sair do Sistema?", null, JOptionPane.YES_NO_OPTION);
				if (s == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema!");
				} else {
					JOptionPane.showInternalMessageDialog(null, "Simule seu Imprestimo novamente.");					
					System.exit(0);
					
					break;

				}
			}

		}

	}
}
