package arrays;
import java .util.*;

public class NoOfEvenAndOdd 
{

	public static void main(String[] args) 
	{
		 int[] array_nums = {1, 6, 15, 36, 5, 7, 2, 4, 9};
			System.out.println("Original Array: "+Arrays.toString(array_nums)); 
			int count = 0;
			for(int i = 0; i < array_nums.length; i++)
			{
				if(array_nums[i] % 2 == 0)
					count++;
			}
			System.out.println("Number of even numbers : "+count);
			System.out.println("Number of odd numbers  : "+(array_nums.length - count));
	}

}
