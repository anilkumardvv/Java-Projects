package arrays;

public class FindingSecondLargestNumber 
{
	public static void main(String args[])
	{  
		int a[]={1,2,5,6,3,21};  
		int b[]={15,16, 17,18,14};  
	
		System.out.println("Second Largest in First Array: "+getSecondLargest(a,6));  
		System.out.println("Second Largest in Second Array: "+getSecondLargest(b,5));  
	}

	
		private static int getSecondLargest(int[] b, int length) 
		{
			int temp;
			for(int i = 0; i < length; i++) 
			{
				for(int j = i+ 1; j < length; j++)
				{
					if(b[i] > b[j])
					{
						temp = b[i];
						b[i] = b[j];
						b[j] = temp;
					}
				}
			}
			
		return b[length-2];
	}

	/*
		public static int getSecondLargest(int[] a, int total)
		{  
			int temp;  
			for (int i = 0; i < total; i++)   
			        {  
			            for (int j = i + 1; j < total; j++)   
			            {  
			                if (a[i] > a[j])   
			                {  
			                    temp = a[i];  
			                    a[i] = a[j];  
			                    a[j] = temp;  
			                }  
			            }  
			        }  
			       return a[total-2];  
			}  
		*/
}


