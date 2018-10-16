package arrays;
import java.util.*;

public class RemovingDuplicateElements 
{
	/*
//Removing Duplicate Element from an array and printing the length of an array
	public static void main(String[] args) 
	{
		int nums[] = {20, 20, 30, 40, 50, 50, 50};  
		System.out.println("Original array length: "+nums.length);
		System.out.print("Array elements are: ");
       for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
		System.out.println("\nThe new length of the array is: "+array_sort(nums));
			
	}


	public static int array_sort(int[] nums) 
	{
    int index = 1;
    for (int i = 1; i < nums.length; i++) 
    {
        if (nums[i] != nums[index-1])
            nums[index++] = nums[i];
    }
    return index;
}

*/
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
        int arr[] = {10,20,20,30,30,40,40,55,50,50};  
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
	
}
