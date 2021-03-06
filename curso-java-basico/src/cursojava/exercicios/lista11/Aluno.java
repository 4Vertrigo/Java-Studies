package cursojava.exercicios.lista11;

public class Aluno {
	public static final int NUMNOTAS = 4;
	
	private String nome;
	private int numMatricula;
	private int[] notas;

	public Aluno() {
		notas = new int[NUMNOTAS];
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	
	public String obterInfo() {
		
		String info = "Nome aluno: " + getNome() + "\n";
		info += "Matricula: " + getNumMatricula() + "\n";
		info += "Notas: ";
		
		int media = 0;
		for(int nota: notas)
		{
			media += nota;
			info += nota + " ";
		}
		
		media /= NUMNOTAS;
		
		info += "\n" + "Media: " + media + " - ";
		
		if(media >= 7)
			info += "Aprovado";
		else
			info += "Reprovado";
		
		return info;
	}
	
}
