package cursojava.aulas.aula5;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean valor1 = true;
		boolean valor2 = false;
		boolean resultado;
		
		
		//eh utilizado o operador duplo (&& ||), ou operador curto circuito por conta da
		//eficienciencia do mesmo. Ele consegue, muitas vezes, saber o resultado da operacao
		//logica olhando apenas para o primeiro sinal recebido (exemplo, AND e valor1 = false)
		//enquanto o operador simples (& |) olha sempre os dois valores.
		
		resultado = (valor1) && (valor2); //porta logica AND
		System.out.println("valor1 AND valor2 " + resultado);
		
		resultado = (valor1) || (valor2); //porta logica OR
		System.out.println("valor1 OR valor2 " + resultado);

		resultado = (valor1) ^ (valor2); //porta logica XOR
		System.out.println("valor1 XOR valor2 " + resultado);
		
		resultado = (valor1) && !(valor2); //porta logica NOT em valor2
		System.out.println("valor1 AND NOT valor2 " + resultado);
	}

}
