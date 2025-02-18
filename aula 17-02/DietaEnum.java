	package pacote;
	
	public enum DietaEnum {
		
		HERBIVORO("Herbívoro"), CARNIVORO("Carnívoro"), ONIVORO("Onívoro"), HEMATOFAGO("Hematófago"), PISCIVORO("Piscívoro");
		
		private String descricao;
		
		private DietaEnum(String descricao) {
			this.descricao = descricao;
		}
		
		public String getDescricao() {
			return this.descricao;
		}
	
	}
