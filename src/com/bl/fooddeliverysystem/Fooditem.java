package com.bl.fooddeliverysystem;

public class Fooditem {
	enum Taste {
		SWEET, SOUR, SPICY, SWEET_SOUR
	};

	enum Category {
		STARTER, JUICES, DESERTS, MAINCOURSE
	};

	enum VegType {
		VEG, NON_VEG
	};

	protected Taste taste;
	protected Category category;
	protected VegType vegType;
	protected int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fooditem [taste=" + taste + ", category=" + category + ", vegType=" + vegType + ", price=" + price
				+ "]";
	}

}
