package bytebank;

public class deposita {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		contaDoPaulo.saca(155);
		System.out.println(contaDoPaulo.saldo);
		
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        
        contaDaMarcela.transfere(3000, contaDoPaulo);
        System.out.println(contaDoPaulo.saldo);
	}
}
