package cursojava.exercicios.lista9;

public class Conversor {

	private static final double PES = 10.76;
	private static final double CENTIMETROQUADRADO = 929;
	private static final double ACRES = 640;
	private static final double PESQUADRADOS = 43560;
	
	public static double metroParaPes(double metros) {
		return metros * PES;
	}
	
	public static double peQuadradoParaCentimetroQuadrado(double pe) {
		return pe * CENTIMETROQUADRADO; 
	}
	
	public static double milhaQuadradaParaAcres(double milhaQuadrada) {
		return milhaQuadrada * ACRES;
	}
	
	public static double acreParaPesQuadrados(double acre) {
		return acre * PESQUADRADOS;
	}
}
