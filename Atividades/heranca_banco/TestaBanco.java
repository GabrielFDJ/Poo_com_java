package heranca_banco;

public class TestaBanco {

	public static void main(String[] args) {
		
		Banco brasil=new Banco();
		brasil.addCliente(new Cliente("Joao", new Poupanca(1234, 100)),0);
		brasil.addCliente(new Cliente("Maria", new Poupanca(1235, 100)),1);
		brasil.addCliente(new Cliente("Nicole", new Poupanca(1236, 100)),2);
		brasil.addCliente(new Cliente("Tiago", new Corrente(1237, 100)),3);
		brasil.sacar(1237, 30);
		brasil.depositar("Maria", 34);
		brasil.atualizar();
		System.out.println("Saldo total do banco "+ brasil.getSaldo());
		brasil.consultar(1234);
		brasil.consultar(1235);
		brasil.consultar(1236);
		brasil.consultar(1237);
	}

}
