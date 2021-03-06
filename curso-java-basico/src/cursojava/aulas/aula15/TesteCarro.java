package cursojava.aulas.aula15;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numeroPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numeroPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		
		van.exibirAutonomia();
		fusca.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro eh DUCATO" + autonomia);
		autonomia = fusca.obterAutonomia();
		System.out.println("A autonomia do carro eh FUSCA" + autonomia);
		
		double qtdCombustivel = van.calcularCombustivel(23); //23kms
		System.out.println("Quantidade combustivel DUCATO: " + qtdCombustivel);
		qtdCombustivel = fusca.calcularCombustivel(23); //23kms
		System.out.println("Quantidade combustivel FUSCA: " + qtdCombustivel);
	}

}
