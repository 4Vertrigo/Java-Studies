package cursojava.exercicios.lista11;

public class Agenda {
	
	private String nomeAgenda;
	private Contato[] contatos;
	
	public Agenda() {
		// TODO Auto-generated constructor stub
	}
	
	public Agenda(String nomeAgenda, Contato[] contatos) {
		this.nomeAgenda = nomeAgenda;
		this.contatos = contatos;
		// TODO Auto-generated constructor stub
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNome(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public String retornaAgenda() {
		
		String info = "Nome da agenda: " + getNomeAgenda() + "\n";
		int i = 1;
		
		if(getContatos() != null)
		{
			for(Contato c : getContatos())
			{
				info += "Contato " + i + ":\n";
				info += c.retornaContato();
				i++;
			}
		}
		
		return info;
	}
	

}
