//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Set;
//
//public class Fermat {
//	
//	public static Set<ArrayList<String>> threadings( int n, Set<String> d)
//	{
//		Set<ArrayList<String>> a = new HashSet<ArrayList<String>>();
//		ArrayList<String> b = new ArrayList<String>(n);
//		String [] colours = new String [d.size()];
//		
//		colours = (String[]) d.toArray();
//				
//		if(n<1)
//				{
//					b.add(null);
//					a.add(b);
//					
//					return a;
//				}
//				else if (n==1)
//				{
//				  for(int i =0; i<d.size();i++)
//				  {
//					  b.add(d.spliterator());
//				  }
//				  }
//				}
//		{
//			
//			
//			return a;
//		}
//		
//	}
//	public static boolean isEquiv(ArrayList<String> n, ArrayList<String> f)
//	{
//		return false;
//		
//	}
//	public static void analyse(Set<ArrayList<String>> n)
//	{
//		
//	}
//	
//	public static void main(String[] args)
//	{
//		int n = Integer.parseInt(args[0]);
//		
//		HashSet<String> d = new HashSet<String>();
//		
//		for(int i =1 ;i<args.length ;i++)
//		{
//			d.add(args[i]);
//		}
//			
//		analyse(threadings(n,d));
//	}
//
//}
