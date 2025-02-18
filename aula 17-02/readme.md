# aula 1

Curso: web 3 - renan
Data da aula: February 17, 2025
Tipo: Aula

para apontar para a propria classe usamos `this` e para uma classe pai usamos o `super`

a ordem do construtor de cima recebe os parâmetros será a mesma que precisa ser retornada

### Data no java

```java
import java.util.Date;
// importa o Date

// codigo
	
Date data = new Date();
```

temos a outra forma com simpleDateFormat

```java
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(data));
```

dessa forma coloca o dia da semana + data 

```java
SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd/MM/yyyy");
System.out.println(sdf.format(data));
```

dessa forma coloca o dia da semana + data + as + hora

```java
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd/MM/yyyy 'às' HH:mm:ss");
		System.out.println(sdf.format(data));
 
```

## usando Calendar

```java
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd/MM/yyyy");
		
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2005);
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(Calendar.DAY_OF_MONTH, 24);
		
		System.out.println(sdf.format(cal.getTime()));
```

para pegar a data atual no calendar

```java
	Calendar cal1 = Calendar.getInstance();
	System.out.println(sdf.format(cal1.getTime()));
```

verificando se a data é antes da aula atual

```java
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2025);
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(Calendar.DAY_OF_MONTH, 24);
		System.out.println(sdf.format(cal.getTime()));
		Calendar cal1 = Calendar.getInstance();
		System.out.println(sdf.format(cal1.getTime()));
		
		
		if (cal.before(cal1)) {
			System.out.println(sdf.format(cal.getTime()));
		}else {
			System.out.println("error");
		}
```

**./pacote/**

`Principal`

```java

```

`Animal` 

```java
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

```

`Cachorro`

```java
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

```

`Gato`

```java
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

```

`HabitatEnum`

```java
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

```

`DietaEnum`

```java
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

```