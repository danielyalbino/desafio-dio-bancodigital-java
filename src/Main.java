
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Daniely");
		
		Conta cc = new ContaCorrente(daniely);
		Conta poupanca = new ContaPoupanca(daniely);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
