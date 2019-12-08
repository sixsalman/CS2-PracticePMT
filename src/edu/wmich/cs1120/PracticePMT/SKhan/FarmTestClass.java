package edu.wmich.cs1120.PracticePMT.SKhan;

import java.util.List;

public class FarmTestClass {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		IFarmApp farm = new FarmApp();
		ILivestock animal1 = new Alpaca(5, 600); // Parameters:(int age, int weight)
		ILivestock animal2 = new Camel(5, 3); // Parameters: (int age, int numberOfHumps)
		ILivestock animal3 = new Donkey(6, "Miniature"); // Parameters: (int age, String breed)
		farm.addLivestock(animal1);
		farm.addLivestock(animal2);
		farm.addLivestock(animal3);
		List<ILivestock> animals = farm.getLivestock();
		System.out.println("List of Animals Sold");
		System.out.println("====================\n");
		for (int i = 0; i < animals.size(); i++) {
			System.out.printf("%s \t$ %,10.2f\n", animals.get(i).getAnimalType(), animals.get(i).getPrice());
		}
		System.out.printf("\nTotal Sales: \t$ %,10.2f\n\n", farm.getTotalPrice());
		ILivestock animal4 = new Donkey(2, "American Mammoth Jack"); // Parameters: (int age, String breed)
		ILivestock animal5 = new Donkey(7, "Burro"); // Parameters: (int age, String breed)
		ILivestock animal6 = new Alpaca(2, 250); // Parameters:(int age, int weight)
		farm.addLivestock(animal4);
		farm.addLivestock(animal5);
		farm.addLivestock(animal6);

		for (int i = 0; i < animals.size(); i++) {
			System.out.printf("%s \t$ %,10.2f\n", animals.get(i).getAnimalType(), animals.get(i).getPrice());
		}
		System.out.printf("\nTotal Sales: \t$ %,10.2f\n", farm.getTotalPrice());
	}
}