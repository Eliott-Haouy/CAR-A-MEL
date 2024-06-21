package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Intégrer les données d'une nouvelle voiture.
		
		try ( Scanner scanner = new Scanner(System.in)) {
				System.out.println("Tapez 2 pour ajouter une voiture:" );
				
			 	int l = Integer.parseInt(scanner.nextLine());
			 	if(l == 2) {
			 		
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
		 
		 }
		}
		
// ajout de voiture test 	
		
	/*	int i = 1 ;
		if(i >= 1){
			System.out.println("Voiture N°" + i);
			ArrayList <Car> CarList = new ArrayList<Car>();
			CarList.add("Brand");
			CarList.add("Model");
			CarList.add("horsePower");
			CarList.add("registration");
			CarList.add("created_at");
			
			System.out.println(CarList);
			
			
		}

	}*/
	/*{
	"cars":[
	{
	"brand": "Renault",
	"model": "Mégane",
	"horsePower": 90,
	"registration": "AB-157-VG",
	"created_at": "2024-06-16T13:49:00.000000"
	},
	{
	"brand": "Citroën",
	"model": "C3",
	"horsePower": 82,
	"registration": "BH-567-JK",
	"created_at": "2024-06-16T13:51:00.000000"
	},
	{
	"brand": "Opel",
	"model": "Corsa",
	"horsePower": 95,
	"registration": "DF-123-MN",
	"created_at": "2024-06-17T14:00:00.000000"
	},
	{
	"brand": BrandEnum,
	"model": Model,
	"horsePower": horsePower,
	"registration": registration,
	"created_at": Date
	}
	]
} */ 
	
	}
}
