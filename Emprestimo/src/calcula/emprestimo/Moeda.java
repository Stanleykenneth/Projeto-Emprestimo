package calcula.emprestimo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class Moeda {	
		 
		protected static BigDecimal valor;
		private static int CASAS_DECIMAIS = 2;
		private static final String UNIDADE_MONETARIA = "R$";
		private static final DecimalFormat FORMATO = new DecimalFormat(UNIDADE_MONETARIA + " #,###,###,##0.00");
		
		
		public Moeda(String valor) {
			
			this.valor = new BigDecimal (valor);
		}
		
		public void somarCom(String valorSomar) {
			this.valor = this.valor.add(new BigDecimal(valorSomar));
		}
		
		public void subtrair(String valorSubtrair) {
			this.valor = this.valor.subtract(new BigDecimal(valorSubtrair));
		}

		public void multiplicar(String valorMultiplicar) {
			this.valor = this.valor.multiply(new BigDecimal(valorMultiplicar));
		}
		
		public void dividir(BigDecimal valorDividir) {
			if(valorDividir.compareTo(BigDecimal.ZERO) == 0) {
			    System.out.println(CASAS_DECIMAIS);
		    }else {
			 this.valor = this.valor.divide(valorDividir, CASAS_DECIMAIS, RoundingMode.HALF_EVEN);
		 }
			
		}

		public BigDecimal getValor() {
			return valor;
		}
		
		public String valorFormatado(){
			return FORMATO.format(valor); 
			
		}

	}

