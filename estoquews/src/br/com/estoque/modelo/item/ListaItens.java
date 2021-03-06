package br.com.estoque.modelo.item;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//Elementos do JAX-B
@XmlRootElement
//Define o acesso pelos atributos
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaItens {
	
	@XmlElement(name = "item")
	private List<Item> itens;

	public ListaItens(List<Item> itens) {
		this.itens = itens;
	}

//	Esse construtor e necessario para o JAX-B
	ListaItens() {
	}
	
	public List<Item> getItens() {
		return itens;
	}
	
}
