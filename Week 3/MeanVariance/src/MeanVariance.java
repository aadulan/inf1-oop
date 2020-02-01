
public class MeanVariance {
	
    public static void main(String[] args){
	  
    	int N = args.length;
    	double[] nums = new double [N];
    	
    	for (int i=0; i<N; i++){
    		
    		nums[i]=Double.parseDouble(args[i]);
    	}
    	
    	double sum = 0.0;
    	
    	for (int i =0; i<N ; i++)
    	{
    		sum += nums[i];
    	}
    	
    	double mean = sum /(nums.length);
      	double zero = 0.0;
    	
    	for (int i = 0; i<N ; i++) {
    		
    		zero += (nums[i]-mean) *(nums[i]- mean);
    	}
    	
    	double variance = zero/(nums.length);
    	
    	System.out.println(mean);
    	System.out.println(variance);
 }
}
