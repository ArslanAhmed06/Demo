
public class Array {

	public static void main(String[] args) {
		
		int [] numbers = {10,20,30,40,50};
		for(int i : numbers)
		System.out.println(i);
		
		String[][] Random = { {"Apple","Mango","Yogurt","slice"}, {"Biscuit","Juice","Bottle"} };
		System.out.println(Random[1][1]);
		
		int [][] cars = {{1,2,3,4}, {5,6,7}};
		for(int i=0; i<cars.length;++i) {
			for(int j=0; j<cars[i].length; ++j) {
				System.out.println(cars[i][j]);
			}
		}
		 String name = "Programiz";

		    System.out.println("Characters in " + name + " are:");

		    // loop through each element
		    for(int i = 0; i<name.length(); i++) {

		      // access each character
		      char a = name.charAt(i);
		      System.out.print(a + ", " + '\n');
		      
		    }
	}

}
