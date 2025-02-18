package pacote;

public enum HabitatEnum {

	SELVA("Selva"), FLORESTA("Floresta"), MAR("Mar"), RIO("Rio"), DESERTO("Deserto"), NEVE("Neve"), CASA("Casa");
	
	private String descricao;
	
	private HabitatEnum(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
}
