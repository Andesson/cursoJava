package hibernatePersistence.conexao;

import org.hibernate.Session;

import hibernatePersistence.util.HibernateUtil;

public class ConexaoHibernatePosgreSQL {

	public static void main(String[] args) {
		Session sessao = null;
	       try{
	       sessao = HibernateUtil.getSessionFactory().openSession();
	       System.out.println("Conectou!");
	      } finally { 
	         sessao.close(); 
	     }

	}

}
