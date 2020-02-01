import java.util.Arrays;

public class ComplexNumbers {
	
	public static double[] complexAdd(double[] z1, double[] z2)
	{
		double [] z3 = new double[2];
		
		z3[0]=z1[0]+z2[0];
		z3[1]=z1[1]+z2[1];
		
		return z3;
	}
	public static double[] complexConjugate(double[] z)
	{
		double [] z1 = new double [2];
		
		z1[0]=z[0];
		z1[1]=-z[1];
		
		return z1; 
		
	}
	public static double [] complexMultiply(double[] z1, double[] z2)
	{
		double [] z3 = new double[2];
		
		z3[0]=(z1[0]*z2[0]-z1[1]*z2[1]);
		z3[1]= (z1[1]*z2[0]-z1[0]*z2[1]);
		
		return z3;
	}
	public static double[] complexReciprocal(double[] z)
	{
		double [] z3 = new double[2];
		
		z3[0]=(z[0]/(z[0]*z[0]+z[1]*z[1]));
		z3[1]=(-z[1]/(z[0]*z[0]+z[1]*z[1]));
		
		return z3;
	}
	
	public static String toString(double[] z)
	{
		String a= null;
		
		if(z[0]>0 && z[1]>0)
		{
			a= String.format("%.1f", z[0]+ "+" +z[1]);
		}
		else if (z[0]==0)
		{
			a= String.format("%.1f", z[1]);
		}
		else if(z[1]==0)
		{
			a= String.format("%.1f", z[0]);
		}
		else if((z[0]<0 && z[1]<0) ||(z[0]>0 && z[1]<0) )
		{
			a= String.format("%.1f",z[0]+z[1]);
		
		}
		else if(z[0]<0 && z[1]>0)
		{
			a=String.format("%.1f",z[0]+ "+" +z[1]);
		}
		
		return a;
	}
	
    public static double[][] sortByMagnitude(double[][] complexList)
    {
    	double [][] a = new double [3][4];
    	return a;
    }
    public static void main (String [] args)
    {
    	double a = Double.parseDouble(args[0]);
    	double b = Double.parseDouble(args[1]);
    	double c = Double.parseDouble(args[2]);
    	double d = Double.parseDouble(args[3]);
    	
    	double [] z1 = new double[2];
    	z1[0]=a;
    	z1[1]=b;
    	
    	double [] z2 = new double[2];
    	z2[0]=c;
    	z2[1]=d;
    	
    	System.out.println(toString(complexAdd(z1,z2)));
    	System.out.println(toString(complexConjugate(z1)));
    	toString(complexMultiply(z1,z2));
    	toString(complexReciprocal(z1));
    	toString(complexConjugate(complexAdd(z1,z2)));
    	
    	
    
    }

}
