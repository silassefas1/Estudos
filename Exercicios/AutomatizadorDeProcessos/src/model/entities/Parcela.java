package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.services.TaxaDeServico;


public class Parcela {
	
	
	int numeroParcelas;
	private List<String> parcelas = new ArrayList<>();
	private TaxaDeServico taxaDeServico;

	public Parcela(int numeroParcelas, TaxaDeServico taxaDeServico) {
		super();
		this.numeroParcelas = numeroParcelas;
		this.taxaDeServico = taxaDeServico;
	}


	public List<String> gerarParcelas(Contrato contrato, int numeroParcelas ) {
		
		int parcelaReferencia = 1;
		double valorParcelaBruta = contrato.getValorContrato()/numeroParcelas;
		
		for(int x =0; x<numeroParcelas; x++) {
			double valorParcelaComTaxas = taxaDeServico.gerarTaxa(valorParcelaBruta, parcelaReferencia);
			LocalDate dataPagamento = contrato.getDataContrato().plusDays(parcelaReferencia*30);
			parcelas.add("Parcela: "+parcelaReferencia+ " - "+ dataPagamento +" Valor: R$ "+ valorParcelaComTaxas);
			parcelaReferencia++;
			
		}

		return parcelas;
	}
	
	public void imprimirParcelas() {
		for(String parcela: parcelas) {
			System.out.println(parcela);
		}
	}



	
	
	
}
