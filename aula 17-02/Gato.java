package pacote;

public class Gato extends Animal{
	public Gato() {
		
	}
	
	public Gato(String especie, HabitatEnum habitat, String genero, DietaEnum dieta, Integer idade, boolean castrado) {
		
		super(especie, habitat, genero, dieta, idade, castrado);

	}
	@Override
	public void FazerSom() {
		System.out.println("pelo menos ganhei um pod");
	}
}
