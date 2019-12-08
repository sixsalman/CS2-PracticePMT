package edu.wmich.cs1120.PracticePMT.SKhan;

public abstract class Livestock implements ILivestock {

	private int age;

	public Livestock(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
}
