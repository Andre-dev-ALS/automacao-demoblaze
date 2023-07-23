package com.demoblaze.compra;

import com.demoblaze.utilities.ExcelActions;

public class CompraModel {
	static final String CAMINHO_DA_PASTA_DE_TRABALHO = "src\\main\\resources\\test_data\\massaDeDados.xlsx";
	static final String NOME_DA_PLANILHA = "dadosPessoaisCompra";

	private String nome;
	private String country;
	private String cidade;
	private String cartao;
	private String mes;
	private String ano;
	private ExcelActions excel;

	public CompraModel() {
		excel = new ExcelActions(CAMINHO_DA_PASTA_DE_TRABALHO, NOME_DA_PLANILHA);
		nome = setAtributo("nome");
		country = setAtributo("país");
		cidade = setAtributo("cidade");
		cartao = setAtributo("cartão");
		mes = setAtributo("mês");
		ano = setAtributo("ano");
	}

	public String getNome() {
		return nome;
	}

	public String getCountry() {
		return country;
	}

	public String getCidade() {
		return cidade;
	}

	public String getCartao() {
		return cartao;
	}

	public String getMes() {
		return mes;
	}

	public String getAno() {
		return ano;
	}

	private String setAtributo(String coluna) {
		return excel.getValueInTheWorksheet(coluna);
	}

}
