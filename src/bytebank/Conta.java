package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo  = this.saldo + valor; 
	}
	
	public void saca(double valor) {
		if(saldo - valor != 0 ) {
			System.out.println("não tem saldo suficiente");
			System.out.println("seu saldo atual é de: " + saldo);
		}
		if(saldo - valor >= 0) {
			this.saldo = this.saldo - valor;
			System.out.println("seu saldo atual é de: " + saldo);
		}
	}
	
	public void transfere(double valor, Conta destino) {
		if(saldo - valor != 0 ) {
			System.out.println("não tem saldo suficiente");
			System.out.println("seu saldo atual é de: " + saldo);
		}
		if(saldo - valor >= 0) {
			this.saldo = this.saldo - valor;
			destino.deposita(valor);
			System.out.println("Transferencia realissada com sucesso!");
			System.out.println("seu saldo atual é de: " + saldo);
		}
	}
}
