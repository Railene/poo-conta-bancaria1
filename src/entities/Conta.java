package entities;

import exceptions.ExcecaoNegocios;

public class Conta {
	private Integer numero;
	private String titular;
	private Double saldo ;
	private Double retirarLimite;
	
	public Conta() {
	}

	public Conta(Integer numero, String titular, Double saldo , Double retirarLimite) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo ;
		this.retirarLimite = retirarLimite;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo ;
	}

	public void setSaldo(Double saldo ) {
		this.saldo  = saldo  ;
	}

	public Double getRetirarLimite() {
		return retirarLimite;
	}

	public void setRetirarLimite(Double retirarLimite) {
		this.retirarLimite = retirarLimite;
	}
	
	public void deposito(double quantidade) {
		saldo  += quantidade;
	}
	
	public void retirar(double quantidade) {
		validarretirar(quantidade);
		saldo  -= quantidade;
	}
	
	private void validarretirar(double quantidade) {
		if (quantidade > getRetirarLimite()) {
			throw new ExcecaoNegocios("Erro de saque: A quantia excede o limite de saque");
		} 
		if (quantidade > getSaldo()) {
			throw new ExcecaoNegocios("Erro de saque: Saldo insuficiente");
		}
	
	}

}
