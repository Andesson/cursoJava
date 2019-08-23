package br.com.jsf.model.pessoa;

import java.util.List;

public interface PessoaDAO  {
	
	public Pessoa salvar(Pessoa pessoa);
	public void excluir(Pessoa pessoa);
	public Pessoa carregar(Integer id);
	public List<Pessoa> listar();
	public List<Pessoa> listar(String listar);

}
