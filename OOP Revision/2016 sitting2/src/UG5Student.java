
public class UG5Student extends Student {
	
	private int extraLevel9s;
	
	public UG5Student( String Name, String uun, int n)
	{
		super( Name, uun,5);
		this.extraLevel9s= n;
	}
	public UG5Student ()
	{
		this("not set", "not set", 0);
	}
	public int level9s()
	{
		return extraLevel9s;
	}
	public boolean addCourse(Course c)
	{
		boolean f;
		
		if(c.getLevel()== 9 && this.extraLevel9s >0 )
		{
			super.addCourse(c);
			f= true;
		}
		else
		{
			f = false;
		} 
		return f;
		
	}
	public String toString()
	{
		String b = super.toString();
		String c= null;
		
				if(this.extraLevel9s== 0 | this.extraLevel9s== 1)
				{
					c=null;
				}
				else
				{
					c= "Taking extra level 9s."+ "Permission for "+ this.extraLevel9s+ " extra";
				}
				
		Course[] d =super.getCourses();
		
				return b+ '\n'+ c +'\n'+ d.toString() ;
	}
}
