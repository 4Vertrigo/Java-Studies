package cursojava.aulas.aula18;

public class TestaClasse {

	public static void main(String[] args) {

		Contato contato = new Contato();
		
		contato.setNome("Jonas");
		//contato.setEndereco("Rua Sao Jose");
		//contato.setTelefone("9999999");
		
		//criar ob endereco
		
		Endereco end = new Endereco();
		end.setNomeRua("Rua Sao Jose");
		end.setCidade("Santo Antonio");
		end.setEstado("Minas Gerais");
		end.setCep("99999999");
		end.setNumero("25A");
		end.setComplemento("Casa");
		
		//relacao tem varios
		Telefone tel0 = new Telefone();
		tel0.setTipo("Celular");
		tel0.setDdd("21");
		tel0.setNumero("999994");
		
		Telefone tel1 = new Telefone();
		tel1.setTipo("fixo");
		tel1.setDdd("21");
		tel1.setNumero("9999918");
		
		Telefone[] telefones = new Telefone[2];
		
		telefones[0] = tel0;
		telefones[1] = tel1;
		
		contato.setEndereco(end);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		if(contato != null && contato.getEndereco() != null)
			System.out.println(contato.getEndereco().getNomeRua());
		if(contato != null)
		{
			
			for(Telefone t : contato.getTelefones())
			{
				if(t != null)
					System.out.println(t.getNumero());
			}
			
		}
	}

}
