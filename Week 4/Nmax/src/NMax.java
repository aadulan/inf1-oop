
public class NMax 
{
	public static int max(int a, int b, int c)
	{
		if(a>=b && a>=c)
		{
			return a;
		}
		
		else if(b>=a && b>=c)
		{
			return b;
		}
		
		return c;
		
		
	}
	
	public static void main(String[] args)
    {
		int a =StdIn.readInt();
		int b =StdIn.readInt();
		int c =StdIn.readInt();
		
		System.out.print("The maximum value is"+ " " +max(a,b,c));
    }

}

//int d2=(int)d; converts a double into an integer