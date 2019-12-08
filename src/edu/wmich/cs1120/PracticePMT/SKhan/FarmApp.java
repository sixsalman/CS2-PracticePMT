package edu.wmich.cs1120.PracticePMT.SKhan;

import java.util.ArrayList;
import java.util.List;

public class FarmApp implements IFarmApp {

	private List<ILivestock> animalsSold;
	
	public FarmApp() {
		animalsSold = new ArrayList<>();
	}

	@Override
	public void addLivestock(ILivestock m) {
		animalsSold.add(m);
	}

	@Override
	public double getTotalPrice() {
		int totPrice = 0;
		for(ILivestock animal: animalsSold) {
			totPrice += animal.getPrice();
		}
		return totPrice;
	}

	@Override
	public List<ILivestock> getLivestock() {
		return animalsSold;
	}

}
