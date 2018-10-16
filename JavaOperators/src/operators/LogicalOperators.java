package operators;

public class LogicalOperators 
{
	/* ! NOT
	 * && AND
	 * || OR
	 * ^ EXCLUSIVE OR
	 * LOGICAL OPERATORS ARE ALSO CALLED BOOLEAN OPERATORS
	 */
	
	public static void main(String[] args) 
	{

		//BOOLEAN and NOT
		boolean human = true;
		if(human)
		{
			System.out.println("I'm a human");
		}
		else
		{
			System.out.println("I'm not a human");
		}
		
		boolean human1 = true;
		if(!human1)
		{
			System.out.println("I'm a human");
		}
		else
		{
			System.out.println("I'm not a human");
		}
		
		//AND &&
		/* True && True = True
		 * True && False = False
		 * False && True = False
		 * False && False = False*/
		
		int num = 11;
		if((num % 2 == 0) && (num % 3 == 0)) 
		{
			System.out.println(num+" is divisible by both 2 and 3");
		}
		else 
		{
			System.out.println(num+" is not divisible by both 2 and 3");
		}
		
		//OR ||
		/*True || True = True
		 * True || False = True
		 * False || True = True
		 * False || False = False*/
		
		if((num % 2 == 0) || (num % 3 == 0)) 
		{
			System.out.println(num+" is divisible by both 2 or 3");
		}
		else 
		{
			System.out.println(num+" is not divisible by both 2 or 3");
		}
		
		//^ ECLUSIVE OR
		/*True ^ False = True
		 * False ^ True = True
		 * True ^ True = False
		 * False ^ False = False*/
		
		if((num % 2 == 0) ^ (num % 3 == 0)) 
		{
			System.out.println(num+" is divisible by both 2 or 3 but not both");
		}
		
	}

}



