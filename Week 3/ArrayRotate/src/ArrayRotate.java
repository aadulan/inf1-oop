
public class ArrayRotate {
	
  public static void main(String[] args) {
	  
	  int N = args.length;
	  int[] nums = new int[N];
	  
	  for (int i=0; i< N; i++){
		  
		  nums[i]=Integer.parseInt(args[i]);
		 		
	  }
	  
	  int first = nums[0]; // why is this giving me an arrayIndexOutofBoundsException 
	  int [] copy = new int[N] ;
	 
	  
	  for(int i =0; i<=N-1 ; i++){
		  
		  if (i == N-1) {
			  
			  copy [N-1] = first ;
			 
		  }
		  
		  else {
		  
		  copy [i] = nums [i+1]; 
		  }
	  }
	  
	 	  
	for (int i =0 ; i<N ; i++){
		
		System.out.print(copy [i]);
	}
			  
  }
}