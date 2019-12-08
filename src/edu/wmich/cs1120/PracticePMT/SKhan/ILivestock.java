package edu.wmich.cs1120.PracticePMT.SKhan;

public interface ILivestock {
	/**
	 * Return this animal's age.
	 * 
	 * @return This animal's age.
	 */
	int getAge();

	/**
	 * Return the type of this animal (Alpaca, Camel or Donkey)
	 * 
	 * @return The type of this animal
	 */
	String getAnimalType();

	/**
	 * Determine and return the price of this animal.
	 * 
	 * @return The price of this animal.
	 */
	double getPrice();
}