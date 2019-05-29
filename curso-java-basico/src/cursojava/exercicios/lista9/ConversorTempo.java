package cursojava.exercicios.lista9;

public class ConversorTempo {
	
	private static final double SEGUNDOS = 60; //segundos para minutos
	private static final double MINUTOS = 60; //minutos para horas
	private static final double HORA = 24; //horas para dias
	private static final double DIASSEMANA = 7; //dias para semanas
	private static final double DIASMES = 30; //dias para meses
	private static final double DIASANO = 365.25; //dias para ano
	
	public static double minutoParaSegundos(double minuto){
		return minuto * SEGUNDOS;
	}
	
	public static double horaParaMinutos(double hora) {
		return hora * MINUTOS;
	}
	
	public static double diaParaHoras(double dia) {
		return dia * HORA;
	}
	
	public static double semanaParaDias(double semana) {
		return semana * DIASSEMANA;
	}
	
	public static double mesParaDias(double mes) {
		return mes * DIASMES;
	}
	
	public static double anoParaDIas(double ano) {
		return ano * DIASANO;
	}

}
