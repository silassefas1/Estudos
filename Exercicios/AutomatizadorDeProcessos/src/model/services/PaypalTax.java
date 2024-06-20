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
		
		double parcelaComJuros = valorParcela+((valorParcela)*(0.01*parcelaReferencia));
		double taxas = parcelaComJuros +(parcelaComJuros*0.02); // 2% da taxa de pagamento
		
		return taxas ;
	}
	




}
