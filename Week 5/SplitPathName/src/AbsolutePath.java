
public class AbsolutePath 
{
	public static String ensureAbsolute(String path)
	{
	 if (path.substring(0).equals("/"))
	 {
		 return path;
	 }
	 
	 String currentDir=System.getProperty("user.dir");
	 
	 return currentDir.concat(path);
	} 
	
	public static String[] absoluteSplitPath(String s)
	{
	       String [] c = new String [4];
	       c=SplitPathName.splitPath(s);
	       
	       return c;
	    		   
	}
}
