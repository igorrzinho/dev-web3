package pacote;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Cachorro("Caramelo", HabitatEnum.SELVA, "macho", DietaEnum.ONIVORO, 10, false);
		Animal animal2 = new Gato("Lulu", HabitatEnum.CASA, "indeciso", DietaEnum.HERBIVORO, 18, true);
		animal1.FazerSom();
		animal2.FazerSom();
		
		ArrayList<Animal> lista = new ArrayList<>();
		
		lista.add(animal1);
		lista.add(animal2);
		
		lista.remove(animal1);
		
		if(lista.contains(animal2)) {
			for (Animal Animal : lista ) {
				if(Animal.getHabitat().getDescricao().equals(HabitatEnum.CASA.getDescricao())){
					
					System.out.println(Animal.getHabitat().getDescricao());
				}
			}
		}
		
		Date data = new Date();
		
		
		System.out.println(data);
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd/MM/yyyy");
		
		System.out.println(sdf.format(data));	
		
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
	}
}
