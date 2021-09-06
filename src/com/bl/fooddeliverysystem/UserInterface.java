package com.bl.fooddeliverysystem;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public void print(List<Fooditem> FoodList) {
		for (int i = 0; i < FoodList.size(); i++) {
			System.out.println(FoodList.get(i));
		}
	}

	public void ShowUserMenu() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n != 4) {
			System.out.println("enter 1 for Adding the food item");
			System.out.println("enter 2 for removing the food item");
			System.out.println("enter 3 for printing the food item");
			System.out.println("enter 4 for exit");
			n = sc.nextInt();

			switch (n) {

			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
		}
	}
}
