
public class NbyN 
{
	public static int[][] nbyn(int N)
	{
		int m = N;
		int n = N;
		
		int[][] a = new int[m][n];
		
		// let [i][i]=i; shorter way to write the for loops.
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
			 if(i==j)
			 {
				 a[i][j]=j;
			 }
			 else
			 {
				 a[i][j]=0;
			 }
				 
			}
		}
	    
		return a;
				
	}
     
	public static void main(String[] args)
	{
		
		int [][] b = nbyn(10);
		
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				System.out.print(b[i][j]);
				
					
			}
			System.out.println(" ");
		}
		
	}
}
