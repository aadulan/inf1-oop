
public class SplitPathName 
{
	public static String[] splitPath(String s)
	{
		String[] a = new String [4];
		
		int dot =s.indexOf(".");
		int slash =s.lastIndexOf("/");
		
		
		a[0]= s.substring(0, slash+1);
        
		a[1]=s.substring(slash+1);
        
		if( dot == -1)
		{
		a[2]= s.substring(slash+1);
		}
		else
		{
			a[2]=s.substring(slash,dot);
		}
        
		if(dot==-1)
		{
			a[3]= "";
		}
		else{
		a[3]= s.substring(dot);
		}
        
        return a;
		
		
	}
	
	public static void main(String[] args)
	{
	
		int N= args.length;
		String[] a = new String[N];
				
			for(int i=0 ; i<N; i++)
			{
				a[i]=args[i];
			}
			
			for(int i =0; i<N; i++)
			{
		
		String [] components = splitPath(args[i]);
		
		System.out.println("File: "+ components[1] + " "+ "Type: "+ components[3] + " " + "["+components[0]+"]" );
			}
			}
}
