
public class NoTriples 
{
  public static boolean noTriples(int[] nums)
   {
	  for(int i=0; i<nums.length;i++)
	  {
		if(i<=nums.length-4)
		{
		   if(nums[i]==nums[i+1] && nums[i+1] == nums[i+2])
		   {
			   return false;
		   } 
		}
			  }
	  return true;
	  
  }
  
  public static void main(String[] args)
  {
	  int N = args.length;
	  int[] nums = new int [N];
	  
	  for (int i = 0; i<N; i++)
	  {
		  nums[i]=Integer.parseInt(args[i]);
	  }
	  
	  System.out.println(noTriples(nums));
  }
}
