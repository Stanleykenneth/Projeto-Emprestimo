package calcula.emprestimo;

import java.math.BigDecimal;

public class Teste extends Moeda {

	public Teste(String valor) {
		super(valor);
		
	}

	public static void main(String[] args) {
	 
		Moeda salario = new Moeda("100000");
		//salario.subtrair("60.00");
		//salario.somarCom("300.00");
		//salario.multiplicar("0.10");
		//salario.dividir(new BigDecimal("1.3"));
		System.out.println(salario.valorFormatado());
		
	}

}
