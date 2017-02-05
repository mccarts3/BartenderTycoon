package utilities;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import menu.*;
import person.*;

public class Tester extends JFrame {
	public static void main(String[] args) {
		JFrame window;
		window = initTestWindow();
		
//		Scanner in = new Scanner(System.in);
//		ArrayList<MixedDrink> drinks = new ArrayList<MixedDrink>();		
//		System.out.print("Enter 'n' to create a new drink: ");
//		char choice = in.next().charAt(0);
//		
//		while(choice == 'n' || choice == 'N') {
//			System.out.println("Create a New Drink");
//			MixedDrink newDrink = createAMixedDrink();
//			drinks.add(drinks.size(), newDrink);
//			System.out.println("Added the drink(s)");
//			
//			System.out.print("Enter 'n' to create a new drink, or 'e' to exit: ");
//			choice = in.next().charAt(0);
//		} 
//		System.out.println("Exiting Menu");
//		
//		System.out.println("Now printing all drinks in the ArrayList");
//		
//		for(int i=0; i<drinks.size(); i++) {
//			NumberFormat formatter = NumberFormat.getCurrencyInstance();
//			System.out.println("Name: " + drinks.get(i).getName());
//			System.out.println("Size: " + drinks.get(i).getSize() + " oz.");
//			System.out.println("Cost: " + formatter.format(drinks.get(i).getCost()));
//		}
//		
//		System.out.println("Now exiting application...");
	}
	
	private static JFrame initTestWindow() {
		JFrame win;
		win = new JFrame("Bartender Tycoon - Test Environment");
		win.setSize(1000,1000);
		win.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		win.setLocationRelativeTo(null);
		win.setVisible(true);
		return win;
	}

	protected static MixedDrink createAMixedDrink() {
		
		/**
		 *  String name
		 *  float cost
		 *  int size
		 *  float abv
		 */
		MixedDrink myDrink = new MixedDrink("Sex on the beach", (float)5.00, 20, (float)12.0);
		return myDrink;
	}
}
