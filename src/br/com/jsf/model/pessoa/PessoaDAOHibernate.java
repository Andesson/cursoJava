package br.com.jsf.model.pessoa;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class PessoaDAOHibernate implements PessoaDAO {

	Session session;
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public Pessoa salvar(Pessoa pessoa) {
		Pessoa merged =(Pessoa) this.session.merge(Pessoa.class);
		return merged;
	}

	@Override
	public void excluir(Pessoa pessoa) {
		this.session.delete(pessoa);
		
	}

	@Override
	public Pessoa carregar(Integer id) {
		
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Pessoa> listar() {
		Criteria criteria = session.createCriteria(Pessoa.class);
		criteria.addOrder(Order.asc("id"));
		return this.listar();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Pessoa> listar(String pessoa) {
		Criteria criteria = session.createCriteria(Pessoa.class);
		if(pessoa != null && !pessoa.equals(pessoa)) {
			criteria.add(Restrictions.like("pessoa", pessoa));
			
		}
		return this.listar();
	}

}
