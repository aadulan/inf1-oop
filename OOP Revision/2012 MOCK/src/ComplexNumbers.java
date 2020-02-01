
public class ComplexNumbers {
	public static double[] complexAdd(double z1[], double[] z2) {
		double[] add = new double[2];
		add[0] = z1[0] + z2[0];
		add[1] = z2[1] + z2[1];
		return add;
	}

	public static  double[] complexConjugate(double[] z) {
		double[] z1 = new double[2];
		z1[0] = z[0];
		z1[1] = z[1];
		return z1;

	}

	public static  double[] complexMultiply( double[] z1, double [] z2)
	{
		double[] z3= new double [2];
		z3[0]= (z1[0]*z2[0]-z1[1]*z2[1]);
		z3[1]= (z1[1]*z2[0]+z2[1]*z1[0]);
		return z3;
	}

	public static double[] complexReciprocal(double[] z)
	{
		double [] fraction = new double [2];
		fraction[0]= (z[0])/(z[0]*z[0])+(z[1]*z[1]);
		fraction[1]= (z[1])/(z[0]*z[0])+(z[1]*z[1]);
		return fraction;
	}
	public static double[][] sortByMagnitude(double[][] complexList)
	{
		return null;
	}
	public static String toString(double [] z)
	{
		String s = "";
		if(z[1]==0)
		{
			s = String.format("%1.f"+"i",z[1]);
		}
		if(z[0]==0)
		{
			s=String.format("%1.f", z[0]);
		}
		if(z[1]<0)
		{
			s= String.format("%1.f"+"%1.f"+"i",z[0] ,z[1]);
		}
		if(z[1]>0)
		{
			s= String.format("%1.f"+"+"+"%1.f"+"i", z[0],z[1]);
		}
		return s;
	}
	public static void main(String [] args)
	{
		double[] z1 = new double [2];
		double[] z2 = new double [2];
		
		z1[0]=Double.parseDouble(args[0]);
		z1[1]=Double.parseDouble(args[1]);
		z2[0]=Double.parseDouble(args[2]);
		z2[1]=Double.parseDouble(args[3]);
		
		System.out.println(toString(complexAdd(z1,z2)));
		System.out.println(toString(complexConjugate(z1)));
		System.out.println(toString(complex));


	}
	
}


