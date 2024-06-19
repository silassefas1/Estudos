package model.services;

public class PaypalTax implements TaxaDeServico {

	private double valorParcela;
	private int parcelaReferencia;
	
	public double getValorParcela() {
		return valorParcela;
	}
	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}
	public int getParcelaReferencia() {
		return parcelaReferencia;
	}
	public void setParcelaReferencia(int parcelaReferencia) {
		this.parcelaReferencia = parcelaReferencia;
	}
	
	public double gerarTaxa(double valorParcela, int parcelaReferencia) {
		
		return (valorParcela*(1+0.01*parcelaReferencia))*(1+0.2);
	}
	




}
