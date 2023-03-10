package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private cliente titular;
	
	//permite consultar o saldo;
	public double getSaldo(){
		return saldo;
	}
	
	//Função para realizar deposito//
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	//função para realizar saques//
	public void saca(double valor) {
		if (saldo - valor != 0) {
			System.out.println("não tem saldo suficiente");
			System.out.println("seu saldo atual é de: " + saldo);
		}
		if (saldo - valor >= 0) {
			this.saldo = this.saldo - valor;
			System.out.println("seu saldo atual é de: " + saldo);
		}
	}
	
	//função para realizar transferencias entre contas//
	public void transfere(double valor, Conta destino) {
		if (saldo - valor != 0) {
			System.out.println("não tem saldo suficiente");
			System.out.println("seu saldo atual é de: " + saldo);
		}
		if (saldo - valor >= 0) {
			this.saldo = this.saldo - valor;
			destino.deposita(valor);
			System.out.println("Transferencia realissada com sucesso!");
			System.out.println("seu saldo atual é de: " + saldo);
		}
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(cliente titular) {
		this.titular = titular;
	}
	
	public cliente getTitular() {
		return titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
