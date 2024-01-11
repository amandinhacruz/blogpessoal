package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tb_postagens")
public class Postagem {
	
	@Id //tornar esse atributo uma chave primaria
	@GeneratedValue(strategy=GenerationType.IDENTITY) // para adicionar um id com incremento
	private Long id;
	
	//essa anotação valida tendo um valor maximo e minimo de caracteres 
	@Size(min=5, max=100, message = "O título deve ter no minino 5 caracteres e no maxímo 100")
	@NotBlank(message = "Atributo titulo obrigatorio")//
	private String titulo;
	
	@Size(min=5, max=1000, message = "O texto deve ter no minino 10 caracteres e no maxímo 1000")
	@NotBlank(message = "Atributo texto obrigatório")//
	private String texto;
	
	@UpdateTimestamp // pega a data do sitema e registrar 
	private LocalDateTime data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	} 
	

}
