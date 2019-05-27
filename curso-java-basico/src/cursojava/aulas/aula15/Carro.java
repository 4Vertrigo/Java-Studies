package cursojava.aulas.aula15;

public class Carro {
	
	//atributos
	String marca;
	String modelo;
	int numeroPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//metodos
	void exibirAutonomia(){
		System.out.println("A autonomia do carro eh: " + (capCombustivel * consumoCombustivel) + " km");
	}
	
	double obterAutonomia(){
		System.out.println("Metodo obterAutonomia foi chamada");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
}
