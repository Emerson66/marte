package com.nosreme.marte.domain.enums;

public enum TipoCliente {
	
//	No Enum é atribuido um codigo e uma descriçao para facilitar a implementaçao no banco
	PESSOA_FISICA(1, "Pessoa Fisíca"),
	PESSOA_JURIDICA(2, "Pessoa Juridíca");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	
	// aqui eu valido o enum 
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())){
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id invalido: " + cod);
	}
	
}
