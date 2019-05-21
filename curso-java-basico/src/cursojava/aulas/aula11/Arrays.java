package cursojava.aulas.aula11;

public class Arrays {

	public static void main(String[] args) {

		/*
		double temperaturaDiaria001 = 31.3;
		double temperaturaDiaria002 = 32;
		double temperaturaDiaria003 = 33.7;
		double temperaturaDiaria004 = 34;
		double temperaturaDiaria005 = 31.1;
					.
					.
					.
		
		eh muito ineficiente declarar tantas variaveis...
		*/
		double[] temperaturas = new double[365];
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 32.1;
		//		.
		//		.
		//		.
		
		System.out.println("O valor da temperatura do dia 3 eh: " + temperaturas[2]);
		
		System.out.println("O tamanho do array: " + temperaturas.length); //tamanho do vetor, mesmo que eles nao estefam inicializados
		
		for(int i = 0; i < temperaturas.length; i++)
			System.out.println("O valor da temperatura o dia " + (i + 1) + " eh: " + temperaturas[i]); //o valor inicial sempre sera 0
		
		for(double temp : temperaturas) //for melhorado, porem, nao se tem acesso aos indices...percorre todo o vetor
			System.out.println(temp);
	}

}