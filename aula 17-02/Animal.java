package pacote;

public class Animal {
	
	private String especie;
	private HabitatEnum habitat;
	private String genero;
	private DietaEnum dieta;
	private Integer idade;
	private boolean castrado;
	
	public void FazerSom() {
		
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public HabitatEnum getHabitat() {
		return habitat;
	}
	public void setHabitat(HabitatEnum habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public DietaEnum getDieta() {
		return dieta;
	}
	public void setDieta(DietaEnum dieta) {
		this.dieta = dieta;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public boolean isCastrado() {
		return castrado;
	}
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	public Animal(String especie, HabitatEnum habitat, String genero, DietaEnum dieta, Integer idade,
			boolean castrado) {
		this.especie = especie;
		this.habitat = habitat;
		this.genero = genero;
		this.dieta = dieta;
		this.idade = idade;
		this.castrado = castrado;
	}
	
	public Animal() {
	}
	
	

}
