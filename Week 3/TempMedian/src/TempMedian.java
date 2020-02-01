import java.util.Arrays;

public class TempMedian
{
	public static void main(String [] args)
     {
    	int N= args.length;
    	String [] a = new String [N];
    	for (int i =0; i<N; i++)
    	{
    		a[i]= args[i];
    	}
    	 
    	int[] nums = new int [N];
    	
    	for(int i = 0; i<N ; i++)
    		
    		if (i!=0)
    		{
    			
    			if(a[i].equals("."))
    			{
    				nums[i]=nums[i-1];
    			}
    			else if(a[i].equals("+"))
    			{
    				nums[i] =nums[i-1]+1;
    			}
    			else
    			{
    				nums[i] =nums[i-1]-1;
    			}
    				
    		}
    		else {
    			nums[i] = Integer.parseInt(a[i]);
    		}
    	for (int i =0; i<N; i++){
    		
 		   System.out.print( nums[i] + " ");
 		 }
         Arrays.sort(nums);
		
		System.out.println(" ");
		
		for(int i= 0 ;i<N ; i++){
			
			System.out.print(nums[i] + " ");
		}
		
		double median = 0.0;
		
		if (N % 2==0)
		{
		     median = (nums[(N-1)/2]+ nums[((N-1)/2)+1])/2.0; 
		}
		else
		{
		 median= nums[N/2];
		}
    	System.out.println(" ");
    	System.out.print(median);
		
     }
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
































































//import java.util.Arrays;

/**
 * 
 */

/**
 * @author s1631442
 *
 */
/*public class TempMedian {
	
	public static void main(String[] args){
		int N = args.length;
		String[] a = new String [N];
		
		for (int i = 0; i<N; i++){
			a[i] =args[i] ; 
				}
		int[] nums = new int[N];
		
         for(int i =0; i<N; i++){
        	  if (i != 0){
        	 
        	 if (a[i]=="."){
        		  nums[i] =Integer.parseInt(a[i-1]);
        	  }
        	  else if (a[i]== "+"){
        			nums[i]=Integer.parseInt(a[i-1])+1;
        		}  
        	  else if (a[i]== "-"){
      			nums[i]=Integer.parseInt(a[i-1])-1;
      		  } 	         	  
        	  else 
        	  {
        			nums[i]= Integer.parseInt(a[i]);
        		}
         }
		 
		for (int j =0; j<N; j++){
		
		   System.out.print( nums[j] + " ");
		 }
		Arrays.sort(nums);
		
		System.out.println(" ");
		
		for(int j= 0 ;j<N ; j++){
			System.out.print(nums[j] + " ");
		}
	}

}}
*/