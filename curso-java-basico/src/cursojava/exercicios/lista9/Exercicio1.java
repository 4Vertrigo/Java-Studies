package cursojava.exercicios.lista9;

public class Exercicio1 {

	public static void main(String[] args) {

		System.out.println(Contador.retorna());
		Contador.incrementar();
		Contador.incrementar();
		System.out.println(Contador.retorna());
		Contador.zerar();
		System.out.println(Contador.retorna());
	}

}
