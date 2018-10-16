package arrays;

public class IndexofArray 
{

	
    public static void main(String[] args) 
    {
      int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
      System.out.println("Index position of 18 is: " + findIndex(my_array, 18));
      System.out.println("Index position of 36 is: " + findIndex(my_array, 36));
    }

    public static int  findIndex (int[] my_array, int t) 
    {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) 
        {
            if (my_array[i] == t) 
            {
            	return i;
            }
            	else i=i+1;
        }
        return -1;
    }
}


/*	
	public static void main(String[] args) 
	{
		int[] arrays = {11, 45, 78, 65,35, 15, 25, 69, 63, 32};
		System.out.printf("Index position of 45 is : " +findIndex(arrays), 45);
		System.out.printf("Index position of 25 is : " +findIndex(arrays), 25);
	}
*/	

/*
	private static int findIndex(int[] arrays) {
		// TODO Auto-generated method stub
		if(arrays == null)
			return -1;
		int len = arrays.length;
		int i = 0;
		while (i<len)
		{
			
			int t = 0;
			if (arrays[i] == t)
			{
				return i;
			}
			else i = i+1;
		}
		return -1;
	}
	}
*/
	
	//Tried ownly but not getting required Output
	/*
	public static int findIndex(int[] arrays)
	{
		if(arrays == null)
			return -1;
		int len = arrays.length;
		int i = 0;
		while (i<len)
		{
			
			int t = 0;
			if (arrays[i] == t)
			{
				return i;
			}
			else i = i+1;
		}
		return -1;
	}
}
	*/