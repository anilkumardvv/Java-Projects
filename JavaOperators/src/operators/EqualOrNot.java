package operators;

public class EqualOrNot 
{

	public static void main(String[] args) 
	{
	
		int a = 100, b = 200 , result;
		
		/*if (a>b) 
		{
			System.out.println("a is greater than b");
		}
		else
			System.out.println("b is greater than a");
		*/
		result = a > b ? a  : b  ; 
		System.out.println(result);
	}

}
