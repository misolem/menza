package main;

import java.util.Scanner; //dodato zbog unosa

public class Test {

	public static Double sabiranje(Double x, Double y) {
		return x+y;
	}
	public static Double oduzimanje(Double x, Double y) {
		return x-y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Hello world!");
			//ctrl + shift + o
			Scanner in = new Scanner(System.in);
			String userInput = in.nextLine();
			
			System.out.println(userInput);
			
			String[] parts = userInput.split(" "); //smjestice elemente bez razmaka
			//korisnik unese: "1 + 3" [1,+,3] budu elementi
			
			String operation = parts[1];
			Double prviBroj = Double.parseDouble(parts[0]); 
			Double drugiBroj = Double.parseDouble(parts[2]);
			Double rezultat = 0.00;
			
			switch(operation) {
			    case "+":
			    rezultat = sabiranje(prviBroj, drugiBroj);
			    break;
			    case "-":
				rezultat = oduzimanje(prviBroj, drugiBroj);
				break;
			  default:
			   }
			System.out.println(rezultat);
			
	}

}
