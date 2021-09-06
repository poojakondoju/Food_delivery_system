package com.bl.fooddeliverysystem;

//Controller Layer
public class Application {

	public static void main(String[] args) {
		ChickenBiryani chickenBiryani = new ChickenBiryani();
		chickenBiryani.setPrice(300);

		HakkaNoodles hakkaNoodles = new HakkaNoodles();
		hakkaNoodles.setPrice(200);

		MasalaDosa masalaDosa = new MasalaDosa();
		masalaDosa.setPrice(70);

		ShahiPaneer shahiPaneer = new ShahiPaneer();
		shahiPaneer.setPrice(400);

		Foodstore Foodstore = new Foodstore();
		Foodstore.add(shahiPaneer);
		Foodstore.add(masalaDosa);
		Foodstore.add(hakkaNoodles);
		Foodstore.add(chickenBiryani);
		
		Foodstore.remove(shahiPaneer);
		
		
		UserInterface Userinterface = new UserInterface();
	     Userinterface.print(Foodstore.getList());


	}
}
