package com.demoblaze.cadastro;

import com.demoblaze.utilities.ExcelActions;

public class CadastroModel {
	static final String CAMINHO_DA_PASTA_DE_TRABALHO = "src\\main\\resources\\test_data\\massaDeDados.xlsx";
	static final String NOME_DA_PLANILHA = "dadosDeCadastro";

	private String nomeDoUsuário;
	private String senha;
	private ExcelActions excel;

	public CadastroModel() {
		excel = new ExcelActions(CAMINHO_DA_PASTA_DE_TRABALHO, NOME_DA_PLANILHA);
		nomeDoUsuário = setAtributo("nomeDeUsuário");
		senha = setAtributo("senha");
	}

	public String getNomeDoUsuário() {
		return nomeDoUsuário;
	}

	public String getSenha() {
		return senha;
	}

	public ExcelActions getExcel() {
		return excel;
	}

	private String setAtributo(String coluna) {
		return excel.getValueInTheWorksheet(coluna);
	}

}
