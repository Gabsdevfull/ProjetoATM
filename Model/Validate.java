package Model;

public class Validate {
	
	public int vadalidarSaque(int saque, double saldoConta, double saldoCaixa) {
			if ((saque <= saldoConta) && (saque <= saldoCaixa)) {
				return (1);
						
			} else 
				return (0);
			
			
	}

}
