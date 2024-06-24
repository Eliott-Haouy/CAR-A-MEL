package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		CarService carService = new CarService();

		ArrayList<Car> carList = new ArrayList<Car>();
		Car car = new Car(BrandEnum.RENAULT, "Mégane", 90, "AB-157-VG", new Date());
		carList.add(car);
		// TODO : récupérer voitures du JSON

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Tapez 1 pour afficher les voitures du parc automobile :"
						+ "\nTapez 2 pour ajouter une voiture :");

				int userChoice = Integer.parseInt(scanner.nextLine());
				if (userChoice == 1) {
					carService.showCarList(carList);
				} else if (userChoice == 2) {
					carList.add(carService.addCar(scanner));
					System.out.println("La voiture a bien été enregistré ");
				}
			}
		}
	}

}
