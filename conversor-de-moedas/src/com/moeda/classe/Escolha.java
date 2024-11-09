package com.moeda.classe;

import java.io.IOException;

import com.moeda.util.ApiCotacao;

public class Escolha {
	
	private String valor;
	private String moeda1;
	private String moeda2;
	private String resultado;
	
	public Escolha(String valor,String moeda1,String moeda2) {
		this.valor = valor;
		this.moeda1 = moeda1;
		this.moeda2 = moeda2;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getMoeda1() {
		return moeda1;
	}

	public void setMoeda1(String moeda1) {
		this.moeda1 = moeda1;
	}

	public String getMoeda2() {
		return moeda2;
	}

	public void setMoeda2(String moeda2) {
		this.moeda2 = moeda2;
	}
	
	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public String consumirAPI() throws IOException, InterruptedException {
		return ApiCotacao.obterCotacao(valor, moeda1, moeda2);
	}
	
	public String toString() {
		return "Convertido "+valor+" "+moeda1+" para "+resultado+" "+moeda2;
	}
	
}
