package br.theus.zowysky.QAaqui.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Desenvolvedores {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short numRegistro; 
	
	@Column(length = 50, nullable = false, unique = true)
	private String nome;
	
	@Column(nullable = false)
	private Short idade; 
	
	@Column
	private LocalDateTime dataDeCadastro;

}
