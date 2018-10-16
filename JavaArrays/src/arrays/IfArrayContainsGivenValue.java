package arrays;

public class IfArrayContainsGivenValue 
{

	public static void main(String[] args) 
	{

		int[] num = {1, 2, 3, 4, 5};
        int ValuetoFind = 10;
        boolean found = false;

        for (int i = 0; i < num.length; i++)
        //for (int i : num)
        {
            if (i == ValuetoFind) 
            {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(ValuetoFind + " is found.");
        else
            System.out.println(ValuetoFind + " is not found.");
    }

}


