package arrays;
import java.util.*;

public class AverageofIntegersinArray {

	//Finding avarage of array elements
	public static void main(String[] args) 
	{
		/*
		int[] array = new int[]{2, 5, 65, 84, 23, 15};
		//Sum of all array elements
		int sum = 0;
		for(int i=0; i < array.length;i++)
		{
			sum = sum + array[i];
		}
		System.out.println("Total sum of array elements is : " +sum);
		//Finding avarage of array elements
		double average = sum / array.length;
		
		System.out.println("The average of array elements is :" +average);
		 
		 */
		
		//Taking Input from the user
		Scanner input = new Scanner(System.in);
		int [] array = new int[10];
		System.out.println("Please enter 10 values which will be stored in an array:");
		for (int i=0; i < 10; i++) 
		{
			array[i] = input.nextInt();
		}
		//Finding the sum of all elements
		int sum = 0;
		for (int j=0; j < array.length; j++)
		{
			sum = sum + array[j];
		}
		System.out.println("Sum of all elements : " +sum);
		//Finding the average of all elements
		double average = sum / array.length;
		System.out.println("Average of the elements stored in the array is : " +average);
	}

}
