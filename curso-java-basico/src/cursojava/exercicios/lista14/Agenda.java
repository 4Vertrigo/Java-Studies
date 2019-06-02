package cursojava.exercicios.lista14;

public class Agenda {
	
	private Contato[] contatos;
	private static int contador = 0;

	public Agenda() {
		contatos = new Contato[5];
		
	}
	
	public int getContador() {
		contador++;
		return contador;
	}

	public void adicionarContato(Contato c) throws AgendaCheiaException {
		
		boolean cheia = true;
		for(int i = 0; i < contatos.length; i++)
		{
			if(contatos[i] == null)
			{
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		
		if(cheia) {
			throw new AgendaCheiaException();
		}
	}
	
	public int consultaContato(String nome) throws ContatoNaoExisteException {
		
		for(int i = 0; i < contatos.length; i++)
		{
			if(contatos[i] != null)
			{
				if(contatos[i].getNome().equalsIgnoreCase(nome))
					return i;
			}
		}
		
		throw new ContatoNaoExisteException(nome);
	}

	@Override
	public String toString() {
		
		String s = "";
		for(Contato c : contatos)
		{
			if(c != null)
				s+= c.toString() + "\n";
		}
		return s;
	}
	

}