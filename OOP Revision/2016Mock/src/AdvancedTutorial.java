import java.util.ArrayList;
import java.util.HashMap;

public class AdvancedTutorial extends Tutorial {
	private String topic;

	public AdvancedTutorial(String tutor, String time, String topic) {
		super(tutor, time);
		this.topic = topic;

	}

	public String toString() {
		String s = "Topic: " + this.topic + " " + super.toString();

		return s;
	}

	public boolean couldCombineWith(AdvancedTutorial t) {
		if (this.topic == t.topic && t.getTime() == this.getTime()) {
			return true;
		} else
			return false;

	}

	public static HashMap<String, ArrayList<AdvancedTutorial>> construct(String[] tutorials) {
		HashMap<String, ArrayList<AdvancedTutorial>> list = new HashMap<String, ArrayList<AdvancedTutorial>>();
		for (int i = 0; i < tutorials.length; i += 3) {
			ArrayList<AdvancedTutorial> tutorial = new ArrayList<AdvancedTutorial>(3);
			tutorial.add(new AdvancedTutorial(tutorials[i+1], tutorials[i+2], tutorials[i ]));
			list.put(tutorials[i], tutorial);
		}
		return list;
	}

	public static void main(String[] args) {
		if (args.length % 3 == 0 && args.length > 0) {
			System.out.println(construct(args));
		} else {
			System.out.println("Wrong number of arguments!");
		}
	}

}
