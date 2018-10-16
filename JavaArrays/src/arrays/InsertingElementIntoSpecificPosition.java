package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class InsertingElementIntoSpecificPosition 
{

	public static void main(String[] args) 
	{
		//Inserting element into predefined array
		/*
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

	    // Insert an element in 3rd position of the array (index->2, value->5)
	   
	   int Index_position = 2;
	   int newValue    = 5;

	  System.out.println("Original Array : "+Arrays.toString(my_array));     
	   
	  for(int i=my_array.length-1; i > Index_position; i--){
	    my_array[i] = my_array[i-1];
	   }
	   my_array[Index_position] = newValue;
	   System.out.println("New Array: "+Arrays.toString(my_array));
	   */
		
		//Inserting Element into user input array
		int n, position, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the position where you want to insert element:");
        position = s.nextInt();
        System.out.print("Enter the element you want to insert:");
        x = s.nextInt();
        for(int i = (n-1); i >= (position-1); i--)
        {
            a[i+1] = a[i];
        }
        a[position-1] = x;
        System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
	}

}
