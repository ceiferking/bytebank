package bytebank;

public class testaBanco {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		cliente paulo = new cliente();

		paulo.setNome("Paulo Silveira");
		paulo.setCpf("32.222.222.40");
		paulo.setProfissao("programador");

		conta.setNumero(1667);

		System.out.println(conta.getNumero());

	}
}
