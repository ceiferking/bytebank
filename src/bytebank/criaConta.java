package bytebank;

public class criaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Primeira conta tem saldo de: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 400;
		System.out.println("Segunda conta tem saldo de: " + segundaConta.saldo);
	}
}
