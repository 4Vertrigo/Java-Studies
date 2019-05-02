package cursojava.aulas.aula5;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 3; //operador de atribuicao
		System.out.println("" + resultado);
		
		resultado = resultado - 1;//operador subtracao
		System.out.println("" + resultado);
		
		resultado = resultado * 2;//operador multiplicacao
		System.out.println("" + resultado);
		
		resultado = resultado / 2;//operador divisao
		System.out.println("" + resultado);
		
		resultado = resultado + 8;//operador soma
		System.out.println("" + resultado);
		
		resultado = resultado % 7;//operador modulo
		System.out.println("" + resultado);
		
		String primeiroNome = "Esta eh ";
		String segundoNome = "uma string concatenada.";
		String terceiroNome = primeiroNome + segundoNome; //operadores logicos tambem sao aceitos em strings
		System.out.println("" + terceiroNome);
	
		System.out.println("" + resultado++); //primeiro se imprime o valor de resultado e depois se acrescenta 1 a ele
		
		System.out.println("" + ++resultado); //primeiro se acrescenta 1 a resultado e depois se printa seu valor
	}

}
