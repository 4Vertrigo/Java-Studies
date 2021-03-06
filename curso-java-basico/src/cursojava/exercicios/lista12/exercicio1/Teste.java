package cursojava.exercicios.lista12.exercicio1;

public class Teste {

	public static void main(String[] args) {

		ContaBancaria contaSimples = new ContaBancaria("Jonas Wendel", 10295461, 5000.0);
		ContaPoupanca poupanca = new ContaPoupanca("Maria Antonieta", 16458101, 1000.0, 30);
		ContaEspecial especial = new ContaEspecial("Ronaldinho Gaucho", 12345678, 11234.0, 10000);
		
		
		contaSimples.sacar(12.0);
		poupanca.sacar(2000.0);
		especial.sacar(12000.0);
		
		contaSimples.depositar(1234.0);
		poupanca.depositar(1000.0);
		especial.depositar(1000.0);
		
		poupanca.calcularNovoSaldo(0.064);
		
		System.out.println(contaSimples.toString() + "\n");
		System.out.println(poupanca.toString() + "\n");
		System.out.println(especial.toString());
	}

}
