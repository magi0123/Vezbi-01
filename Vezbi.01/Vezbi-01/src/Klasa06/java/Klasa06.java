package Klasa06.java;

public class Klasa06 {

	public static void main(String[] args) {
		String article1 = "чоколадо"; 
		String price1 = "50";
		String quantity = "5";
		String article2 = "coК";
		String price2 = "35";
		String unit = "денар";

		int chocolatePrice = Integer.parseInt(price1) * Integer.parseInt(quantity);
		int juicePrice = Integer.parseInt(price2) * Integer.parseInt(quantity);
		int totalPrice = chocolatePrice + juicePrice;

		System.out.println("Cмeткa: ");
		System.out.println("Eдно "+ article1 + " - "+ price1 + " " + unit + "и. ");
		System.out.println(price1 + " x " + quantity + " = " + chocolatePrice);

		System.out.println("Eден "+ article2 + " - "+ price2 + " " + unit + "и. ");
		System.out.println(price2 + " x " + quantity + " = " + juicePrice);
		System.out.println("Вкупна цена: " + totalPrice);
		

	}

}
