package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		        

		
		
		
		
		
		
		
		
			 
// Intégrer les données d'une nouvelle voiture.
		
	/*	 try ( Scanner scanner = new Scanner(System.in)) {
		        
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
			        String Model = scanner.nextLine();
			        
			        System.out.println("La puissance:");
			        int horsePower = Integer.parseInt(scanner.nextLine());
			        
			        System.out.println("La plaque d'immatriculation: " );
			        String registration = scanner.nextLine();
			      
			     if(registration != null) {
			        System.out.println("La voiture a bien été enregistré " );
			     }      
		 Car car = new Car(Brand, Model, horsePower, registration); 
		 
		 }
		    
			*/
	
		
// ajout de voiture test 	
		
		int i = 1 ;
		if(i >= 1){
			System.out.println("Car N°" + i);
			ArrayList <Car> CarList = new ArrayList<Car>();
			CarList.add("Brand");
			CarList.add("Model");
			CarList.add("horsePower");
			CarList.add("registration");
			CarList.add("created_at");
			
			System.out.println(CarList);
		}
		else if(i<= 0 ){
			System.out.println("Car N°" + i);
			ArrayList <Car> CarList = new ArrayList<Car>();
			CarList.add("Brand");
			CarList.add("Model");
			CarList.add("horsePower");
			CarList.add("registration");
			CarList.add("created_at");
			
			System.out.println(CarList);
			
		}

		
				

	}
		
}
