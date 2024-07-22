/*Paulina Ruda
 * Arrays 3 elements and sum 
 * 1.10.2021
 */

package arr1;

import java.util.Scanner;

public class arrayf {

	public static void main(String[] args) {
		
		// get values
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		int [] numbers = new int [4];
		
		
			
		int sum = 0;
			//read values
		
		
			
		for (int i=1; i<4; i++)
			
	      {
			
			System.out.println("Number" + i + "?");
	    	  numbers[i] = scanner.nextInt();
	      }
			
			for( int num : numbers) {
		          sum = sum+num;
		          
			 }
			System.out.println("Sum of array elements is:"+sum);
			
		
		
		
		
		
		
    
			  
	}
	
	
}
		
	


