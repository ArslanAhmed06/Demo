class Major {
	public void sysout() {
		System.out.println("new Method is here");

	}
}
public class Array {

	public static void main(String[] args) {
		
		int [] numbers = {10,20,30,40,50};
		for(int i : numbers)
		System.out.println(i);
		int [][] cars = {{1,2,3,4}, {5,6,7}};
		for(int i=0; i<cars.length;++i) {
			for(int j=0; j<cars[i].length; ++j) {
				System.out.println(cars[i][j]);
			}
			Major nmbr = new Major();
			nmbr.sysout();
			
		}
		   int n;
		    Scanner sc=new Scanner(System.in);  
		    System.out.print("Enter the number of elements you want to store: ");   
		    n=scan.nextInt();  
		    int[] array = new int[10];  
		    System.out.println("Enter the elements of the array: ");  
		    for(int i=0; i<n; i++)  
		    {     
		    array[i]=sc.nextInt();  
		    }  
		    System.out.println("Array elements are: ");    
		    for (int i=0; i<n; i++)   
		    {  
		    System.out.println(array[i]);  
		    }  
			
	}

}
