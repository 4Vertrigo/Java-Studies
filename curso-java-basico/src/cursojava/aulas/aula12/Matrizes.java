package cursojava.aulas.aula12;

public class Matrizes {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 9;
		notasAlunos[1][3] = 9.5;
		
		notasAlunos[2][0] = 1;
		notasAlunos[2][1] = 7;
		notasAlunos[2][2] = 9;
		notasAlunos[2][3] = 9.5;
		
		//		.
		//		.
		//		.
		
		//maneira de imprimir uma matriz na tela
		for(int i = 0; i < notasAlunos.length; i++)
			for(int j = 0; j < notasAlunos[i].length; j++)
				System.out.println("M[" + i + "][" + j +"] = " + notasAlunos[i][j]);
		
		//mudando a quarta nota do segundo aluno
		
		notasAlunos[1][3] = 8;
		
		System.out.println("Calculando a media");
		double soma;
		
		for(int i = 0; i < notasAlunos.length; i++)
		{
			soma = 0;
			for(int j = 0; j < notasAlunos[i].length; j++)
				soma += notasAlunos[i][j];
			
			System.out.println("Media do aluno " + i + " eh = " + (soma/4));
		}
		
		//iniciando uma matriz direto
		
		double[][]notasAlunos2 = {{7, 8, 9, 10}, {8, 5, 6, 10}};
		
		System.out.println();
		
		for(int i = 0; i < notasAlunos2.length; i++)
		{
			soma = 0;
			for(int j = 0; j < notasAlunos2[i].length; j++)
				soma += notasAlunos2[i][j];
			
			System.out.println("Media do aluno " + i + " eh = " + (soma/4));
		}
	}

}
