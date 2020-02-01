
public class Mode 
{
   public static void main(String[] args)
   {
	  int N= args.length; 
	  int[] dataset = new int[N];
	  
	  for (int i =0; i<N; i++)
	  {
		  dataset[i]=Integer.parseInt(args[i]);
	  }
	  
	  int[] count= new int[9];
	  int num = 0;
	  
	  for(int i=0; i<N ; i++)
	  {
	    if (i == dataset[i])
	    {
	    	count[i]=num++;
	    }
	    
	    else 
	    {
	    	count[i]= 0;
	    }
	  }
	  
	  for(int i= 0; i<10; i++)
	  {
		  System.out.println("["+ i + ":" + " " + count[i]+ "]");
	  }
	  double max = count[0];
	  
	  for (int i = 1; i<10; i++)
	  {
		  if (count[i]> max)
		  {
			  max = count[i];
		  }
		  
		System.out.println("Mode"+ ":"+ " " + max);  
	  }
   }
}
