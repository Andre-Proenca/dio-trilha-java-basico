
public class Main {

	public static void main(String[] args) {
		Cliente andre = new Cliente();
		andre.setNome("André");
		
		Conta cc = new ContaCorrente(andre);
		Conta poupanca = new ContaPoupanca(andre);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.depositar(200);
		cc.sacar(20);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
