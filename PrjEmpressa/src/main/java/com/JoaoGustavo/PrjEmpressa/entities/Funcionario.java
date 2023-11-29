package com.JoaoGustavo.PrjEmpressa.entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long funCodigo;
	
	private String funNome;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate funNascimento;
		
	private Long funSalario;
	
	@ManyToOne
	private Departamento departamento;

	//inserir os metodos get e o set
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public Long getfunCodigo(){
		return funCodigo;
	}
	
	public void setfunCodigo(Long funCodigo){
		this.funCodigo = funCodigo;
	}
	
	public String getfunNome(){
		return funNome;
	}
	
	public void setfunNome(String funNome) {
		this.funNome = funNome;
	}
	
	public LocalDate getfunNascimento(){
		return funNascimento;
	}
	
	public void setfunNascimento(LocalDate funNascimento) {
		this.funNascimento = funNascimento;
	}
	
	public Long getfunSalario(){
		return funSalario;
	}
	
	public void setfunSalario(Long funSalario) {
		this.funSalario = funSalario;
	}
	
}