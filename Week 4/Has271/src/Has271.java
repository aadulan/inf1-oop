
public class Has271 
{
	public static boolean has271(int[] nums)
	{
		for(int i=0; i<nums.length; i++)
		{
		  int a = nums[i];
		   
		  if (i<=nums.length-2)
		  {
				   
				  if (nums[i]== a && nums[i+1]== a+5 && nums[i+2]== a-1)
				  {
					  return true;
				  }
		  }
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		int N = args.length;
		int[] nums = new int[N];
		
		for( int i=0; i<N; i++)
		{
			nums[i]=Integer.parseInt(args[i]);
		}
		
		System.out.println(has271(nums));
	}
	
}