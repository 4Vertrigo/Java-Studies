package cursojava.exercicios.lista9;

public class ConversorVolumes {
	
	private static final double CENTIMETROSCUBICOS = 1000;
	private static final double LITROSm3 = 1000;
	private static final double PESCUBICOS = 35.32;
	private static final double POLEGADASCUBICAS = 231;
	private static final double LITROSgla = 3.785;
	
	public static double litroParaCentimetrosCubicos(double litro) {
		return litro * CENTIMETROSCUBICOS;
	}
	
	public static double metroCubicoParaLitros(double m3) {
		return m3 * LITROSm3; 
	}
	
	public static double metroCubicoParaPesCubicos(double m3) {
		return m3 * PESCUBICOS;
	}
	
	public static double galaoAmericanoParaPolegadasCubicas(double galaoAmericano) {
		return galaoAmericano * POLEGADASCUBICAS;
	}
	
	public static double galaoAmericanoParaLitros(double galaoAmericano) {
		return galaoAmericano * LITROSgla;
	}

}
