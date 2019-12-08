package edu.wmich.cs1120.PracticePMT.SKhan;

public class Donkey extends Livestock {

	private String breed;
	
	public Donkey(int age, String breed) {
		super(age);
		this.breed = breed;
	}

	@Override
	public int getAge() {
		return super.getAge();
	}

	@Override
	public String getAnimalType() {
		return "Donkey";
	}

	@Override
	public double getPrice() {
		if(getAge()<3)
			return 20000;
		if(breed.equals("Miniature"))
			return 100000;
		if(breed.equals("Burro"))
			return 120000;
		return 180000;
	}

}
