package model.services;

import java.time.LocalDateTime;

public class Parcela {
	

	private double valorContrato;
	private LocalDateTime dataContrato;
	private int numeroParcelas;
	
	private TaxaDeServico taxaDeServico;
	String[][] parcela;

	public Parcela(double valorContrato, LocalDateTime dataContrato, int numeroParcelas) {
		super();
		this.valorContrato = valorContrato;
		this.dataContrato = dataContrato;
		this.numeroParcelas = numeroParcelas;
	}

	public double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public LocalDateTime getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(LocalDateTime dataContrato) {
		this.dataContrato = dataContrato;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}
	
	public boolean gerarParcelas(double valorContrato, LocalDateTime dataContrato, int numeroParcelas,TaxaDeServico taxaDeServico) {
		
		double valorBrutoParcela = valorContrato/numeroParcelas;
		for(int x = 0;x<numeroParcelas+1;x++ ) {
			for(int y=0;y<=1;y++) {
				
				
			}
		}
		
		return false;
		
	}
	

	
	
	
}
