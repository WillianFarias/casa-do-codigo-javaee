package br.com.casadocodigo.loja.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.casadocodigo.loja.models.Livro;

@Named
@RequestScoped
public class AdminLivrosBean {
	
	private Livro livro = new Livro();
	private String nome;
	
	public void salvar() {
		System.out.println("Livro cadastrado: " + livro);
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
