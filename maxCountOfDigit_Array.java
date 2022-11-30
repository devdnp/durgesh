import java.util.*;
import java.util.Scanner;

public class maxCountOfDigit_Array {

	
	public static void main(String[] args) {
		// Create instance of the Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of items in the list: ");
		int n=sc.nextInt();   //Declare and Initialize the number of terms
		int list[]=new int[n];
		int i=0;
		//Take input from the user
		System.out.println("Enter "+n+"nos:: ");
		for (i=0;i<list.length; i++){
			list[i]=sc.nextInt();
		}
		int counter[]=new int[10];
		int p[]=new int[10];
		
		//check Digit Frequent for each no
		for (i=0; i<counter.length; i++){
			counter[i]=0;
		}
		int d;
		for (i=0;i<list.length; i++){
			int x=list[i];
			while(x>0){
				d=x%10;
				x=x/10;
				counter[d]= counter[d] +1;
			}
		}
		
		//Print Digit Frequent
		for (i=0; i<counter.length; i++){
			System.out.println(i+" -> "+counter[i]);
		}
		
		// start with the first value
		int maximum = counter[0];   
	    for ( i=1; i<counter.length; i++) {
	        if (counter[i] > maximum) {
	            maximum = counter[i];   // new maximum
	        }
	    }

	    System.out.println("Most Frequent digits  :: "); //print most frequent digits
	    for ( i=1; i<counter.length; i++) {
	        if(counter[i] == maximum){
	        	System.out.print(" "+i);
	        }
	    }
		
	}

}