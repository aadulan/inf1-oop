
public class Lucas {
	
	private static long [] lucas;
	private static double phiPlus = (Math.sqrt(5)+1)/2;
	private static double phiMinus = (Math.sqrt(5)-1)/2;
	
	public static void upto( int n)
	{
		lucas = new long[n];
		lucas[0]= 2;
		lucas[1]= 1;
		for(int i=2; i<n; i ++)
		{
			lucas[i]=lucas[i-1]+ lucas [i-2];
		}
	}
	public static void primes()
	{
		long k =0;
		for (int i = 0; i < lucas.length; i++) 
		{
			boolean match = true;
			for (int j = 0; j < lucas[i]; j++) 
			{
				
				if((lucas[i] % j!=k))
				{
					match = match && true;
				}else
				{
					break;
				}
					
				
			}
			System.out.println("L("+i+")="+lucas[i]);
		}
	}
	public static double maxDiffClosedForm()
	{
		double [] difference = new double [lucas.length];
		for (int i = 0; i <lucas.length; i++) {
			difference [i]= Math.pow(phiPlus, i) + Math.pow(-phiMinus, i) - lucas[i];
		}
        double max = 0;
        for (int i = 0; i < difference.length; i++) 
        {
			if( difference[i]> max)
			{
				max = difference [i];
			}
		}
        return max;
	}
	public static void main (String [] args)
	{
		int n = Integer.parseInt(args[0]);
		if ( n>1 && n<43)
		{
			upto(n);
			primes();
			String s = String.format("%.15f",maxDiffClosedForm());
			
			System.out.println(s);
			
		}
	}
	
}
