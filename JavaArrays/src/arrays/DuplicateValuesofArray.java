package arrays;

public class DuplicateValuesofArray 
{

	public static void main(String[] args) 
	{
		 int[] my_array = {1, 1, 1, 1, 2, 5, 5, 6, 6, 7, 2};
		 
	        for (int i = 0; i < my_array.length-1; i++)
	        {
	            for (int j = i+1; j < my_array.length; j++)
	            {
	                if ((my_array[i] == my_array[j]) && (i != j))
	                {
	                    System.out.println("Duplicate Element : "+my_array[j]);
	                }
	            }
	        }
	}

}
/*Not getting Desired O/P, however if the value is repeated twice then the 
  right O/P is obtained*/