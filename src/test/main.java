package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		ArrayList <Car> carList = new ArrayList<Car>();
		Car car = new Car(BrandEnum.Citroen, "C3", 23,"AZ-TR4-A4", new Date());
		carList.add(car);
		// TODO : récupérer voitures du JSON
		
		try ( Scanner scanner = new Scanner(System.in)) {
			while(true) {
				System.out.println("Tapez 1 pour ajouter une voiture :"
						+ "\nTapez 2 pour ajouter une voiture :" );
				
				int userChoice = Integer.parseInt(scanner.nextLine());
				if(userChoice == 1) {
					showCarList(carList);
				} else if(userChoice == 2) {
//					TODO : appeler fonction...
				}
			}
		
		
		
    
	 
		 }
		}
	
	private static void showCarList(ArrayList<Car> carList) {
		System.out.println("la voiture");
		for(Car car : carList) {
			System.out.println(car.toString());
		}
	}
		
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


