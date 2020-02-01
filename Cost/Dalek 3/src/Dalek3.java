import java.util.ArrayList;

public class Dalek3{
	
	public void addsSaying1(String s){
		
		
		u1.add(s);
	}
	
	public static void main(String[] args) {

	    Dalek3 d1 = new Dalek3();
	    
	    ArrayList<String> u1= new ArrayList<String>();
	    u1.add("Exterminate, Exterminate!");
	    u1.add("I obey!);
	    u1.add("Exterminate, annihilate, DESTROY!");
	    
	    		
	    
	    
	    
	    
	    
	     u1 = { "Exterminate, Exterminate!", "I obey!",
	            "Exterminate, annihilate, DESTROY!", "You cannot escape.",
	            "Daleks do not feel fear.", "The Daleks must survive!" };
	    
	     d1.setSayings(u1);

	    System.out.println("\nDalek d1 says: ");
	    for (int i = 0; i < 10; i++) {
	        d1.speak();
	    }

	    System.out.println("\nDalek d2 says: ");
	    Dalek3 d2 = new Dalek3();
	    String[] u2 = { "I obey!" };
	    d2.setSayings(u2);

	    for (int i = 0; i < 10; i++) {
	        d2.speak();
	    }

	}
}