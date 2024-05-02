import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// ArrayList = = = > a resizable array.
		// Element can be added and removed after compilation phase
		// store reference data types

		ArrayList<String> food = new ArrayList<String>();
		food.add("Pizza");
		food.add("Burger");
		food.add("Fries");
		food.add("Fish");
		food.add("Crisps");
		
		//.set -  > replaces the element at the specified position
		food.set(0, "sushi");
		//.remove -  > removes  the element at the specified position
		food.remove(1);
		//Removes all the elements from the list 
		food.clear();
		

		// .size() - > the number of elements in the list
		for (int i = 0; i < food.size(); i++) {
			// .get(i) - - > returns the element at the specified position in the list
			System.out.println(food.get(i));
		}

	}

}
