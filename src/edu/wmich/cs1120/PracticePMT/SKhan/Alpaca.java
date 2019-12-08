package edu.wmich.cs1120.PracticePMT.SKhan;

public class Alpaca extends Livestock {

	private int weight;
		
	public Alpaca(int age, int weight) {
		super(age);
		this.weight = weight;
	}

	@Override
	public int getAge() {
		return super.getAge();
	}

	@Override
	public String getAnimalType() {
		return "Alpaca";
	}

	@Override
	public double getPrice() {
		if(getAge()<=3)
			return 10000;
		if (weight<=300)
			return 80000;
		return 100000;
	}

}
