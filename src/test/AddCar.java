package test;

import java.util.Scanner;

public class AddCar {
	{
	Car addCar = new Car();
	try ( Scanner scanner = new Scanner(System.in)) {	
		
		BrandEnum Brand = null;
		while(Brand == null) {
		System.out.println("La marque:" );
		String BrandName = scanner.nextLine();
		Brand = BrandEnum.findByValue(BrandName);
		if(Brand == null) {
    	System.out.println("Cette marque de voiture n'est pas accepté dans notre parc automobile");
		}
		}
		System.out.println("Le modèle:" );
		String model = scanner.nextLine();
    
		System.out.println("La puissance:");
		int horsePower = Integer.parseInt(scanner.nextLine());
    
		System.out.println("La plaque d'immatriculation: " );
		String registration = scanner.nextLine();
	
		if(registration != null) {
		System.out.println("La voiture a bien été enregistré " );
		}  
	}
}
}