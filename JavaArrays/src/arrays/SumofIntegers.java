package arrays;

public class SumofIntegers {
//Program to perform Sum of Integers within given array
	public static void main(String[] args) 
	{
		int array[] = {10, 40, 30, 40, 50, 10};
	      int sum = 0;
	      //Advanced for loop
	      for( int num : array) 
	      {
	          sum = sum + num;
	      }
	      System.out.println("Sum of array elements is:"+sum);
	   }

}
