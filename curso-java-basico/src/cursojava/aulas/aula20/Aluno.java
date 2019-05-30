package cursojava.aulas.aula20;

import java.util.Arrays;

public class Aluno{
	
	private String curso;
	private double[] notas;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + ", verificaAprovado()="
				+ verificaAprovado() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Aluno other = (Aluno) obj;

		if(curso.equalsIgnoreCase(other.getCurso()))
			return true;
		
		return false;
	}

	public boolean verificaAprovado() {
		return true;
	}

	/*public String toString() {
		String s = curso + "\n";
		
		for(double nota : notas)
			s += nota + " ";
		
		return s;
	}*/
}
