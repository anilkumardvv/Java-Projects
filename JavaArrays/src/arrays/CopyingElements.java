package arrays;

import java.util.Arrays;

public class CopyingElements 
{

	public static void main(String[] args) 
	{
		/*
		// Manually Copying
		int[] a = {10, 20, 30, 40, 50};
		int[] b = new int[a.length]; 
		//copying one array to another
		for(int i = 0; i<a.length; i++)
		{
		//copying one array to another
			b[i] = a[i];
		}
		//Printing arrays
		for(int i = 0; i<b.length; i++) 
		{
			//System.out.print("\n" + b[i]);
			System.out.println(b[i]);
		}
		*/
		
		/*
		//Using Arrays.copyOf()
		//	Syntax is ....public static int[] copyOf(int[] original,int newLength)
		
		int[] a = {10, 20, 30, 40, 50};
		int[] b = new int[a.length];
		
		//copying one array to another
		b = Arrays.copyOf(a, a.length);
		//Printing arrays
		for(int i = 0; i<b.length;++i) 
		{
			System.out.println(b[i]);
		}
		*/
		/*
		//Using System.arraycopy()
		 int a[]={10,20,30,40,50};
		 int b[]=new int[a.length];
	        
	        //copying one array to another
	        System.arraycopy(a,0,b,0,a.length);
	        
	        //printing array
	        for(int i=0;i<b.length;++i){
	            System.out.print(b[i]+" ");
	        }
	      */  
	     //Using Object.clone()
	        int a[]={10,20,30,40,50};
	        int b[]=new int[a.length];
	        
	        //copying one array to another
	        b=a.clone();
	        
	        //printing array
	        for(int i=0;i<b.length;++i){
	            System.out.print(b[i]+" ");
	        }
	}

}
