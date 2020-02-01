
public class UG1Student extends Student {
	
	private char mainSchedule;
	
	public UG1Student(String name, String uun, char schedule){
		super(name,uun,1);
		this.mainSchedule= schedule;
		
	}
	public UG1Student()
	{
		this("not set","not set",'X');
	}
	public boolean addCourse(Course c ){
		if(c.getLevel()==7 || c.getLevel()==8)
		{
			super.addCourse(c);
			return true;
		}
		else return false;
	}
	public boolean  adddCourse(Course[] c)
	{
		boolean a = true;
		for (int i = 0; i < c.length; i++) {
			a =a && addCourse(c[i]);
		}
		return a;
	}
	public String toString(){
		String t = "";
		for(int i =0; i<super.getCourses().length; i++)
		{
			t = super.getCourses()[i].getName() +"\n";
		}
		
		String s = super.toString() + "\n"+"Main schedule "+ this.mainSchedule +" courses:\n" + t;
		return s;
	}
	
	

}
