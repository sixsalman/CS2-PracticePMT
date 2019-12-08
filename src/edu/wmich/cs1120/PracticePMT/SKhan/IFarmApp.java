package edu.wmich.cs1120.PracticePMT.SKhan;

import java.util.List;

public interface IFarmApp {
	/**
	 * Return an arrayList of the animals sold
	 * 
	 * @return A list of the animals sold
	 */
	List<ILivestock> getLivestock();

	/**
	 * Add the animal object to the list of livestock sold.
	 * 
	 * @param m The animal to be added
	 */
	void addLivestock(ILivestock m);

	/**
	 * Computes and returns the total price of all the animals sold.
	 * 
	 * @return Total price of all animals sold.
	 */
	double getTotalPrice();
}
