package com.bl.fooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

//this is data layer / model layer
public class Foodstore {
	private List<Fooditem> foodList = new ArrayList<>();

	public void add(Fooditem foodItem) {
		foodList.add(foodItem);
	}

	public void remove(Fooditem Fooditem) {
		foodList.remove(Fooditem);
	}

	public List getList() {
		return foodList;
	}
}
