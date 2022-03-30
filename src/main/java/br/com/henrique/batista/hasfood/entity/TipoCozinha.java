package br.com.henrique.batista.hasfood.entity;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class TipoCozinha {
	
	
	@id
	ID_TIPO_COZINHA;
	
	@Column
	TX_NOME;
	
	@Column
	DT_EXCLUSAO;
}
