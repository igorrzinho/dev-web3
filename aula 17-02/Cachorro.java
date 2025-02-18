package pacote;

public class Cachorro extends Animal {
	public Cachorro() {
		
	}
	public Cachorro(String especie, HabitatEnum habitat, String genero, DietaEnum dieta, Integer idade, boolean castrado) {
		
		super(especie, habitat, genero, dieta, idade, castrado);

	}
	@Override
	public void FazerSom() {
		System.out.println("au au au");
	}
}

