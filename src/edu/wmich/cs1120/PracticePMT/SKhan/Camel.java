package edu.wmich.cs1120.PracticePMT.SKhan;

public class Camel extends Livestock {

	private int numberOfHumps;
		
	public Camel(int age, int numberOfHumps) {
		super(age);
		this.numberOfHumps = numberOfHumps;
	}

	@Override
	public int getAge() {
		return super.getAge();
	}

	@Override
	public String getAnimalType() {
		return "Camel";
	}

	@Override
	public double getPrice() {
		if(getAge()<=3)
			return 50000;
		if(numberOfHumps==2)
			return 150000;
		return 200000;
	}

}
