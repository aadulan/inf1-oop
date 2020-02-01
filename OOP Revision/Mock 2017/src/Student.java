import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Person {

	private ArrayList<Course> activeCourses;
	private ArrayList<Course> completedCourses;
	private int maxCourses;

	public int getMaxCourses() {
		return maxCourses;
	}

	public void setMaxCourses(int maxCourses) {
		this.maxCourses = maxCourses;
	}

	public Student(String firstName, String lastName, ArrayList<Course> activeCourses,
			ArrayList<Course> completedCourses, int n) {
		super(firstName, lastName);
		this.activeCourses = activeCourses;
		this.completedCourses = completedCourses;
		this.maxCourses = n;

	}

	public boolean canEnroll(Course c) {
		if (activeCourses.contains(c) && completedCourses.contains(c) && activeCourses.size() < maxCourses
				&& completedCourses.contains(c.getPrerequisiteCourses())) {
			return true;
		} else
			return false;
	}

	public boolean enroll(Course c) {
		if (canEnroll(c)) {
			activeCourses.add(c);
			return true;
		} else
			return false;
	}

	public boolean complete(String courseName) {
		if (activeCourses.contains(courseName)) {
			activeCourses.remove(courseName);
			// completedCourses.add( courseName);

			return true;
		} else
			return false;
	}

	public HashMap<Course, String> getAllCourses() {
		HashMap<Course, String> courses = new HashMap<Course, String>();

		for (int i = 0; i < activeCourses.size(); i++) {
			courses.put(activeCourses.get(i), "active");
		}
		for (int j = 0; j < completedCourses.size(); j++) {
			courses.put(completedCourses.get(j), "completed");
		}

		return courses;
	}

	public String summary() {
		// HashMap<Course,String> courses = new HashMap<Course,String>();
		// courses= getAllCourses();
		//
		// return courses.toString();
		String temp = "";

		for (Course active : activeCourses) {
			temp += active.getName() + " (active)\n";
		}
		for (Course comp : completedCourses) {
			temp += comp.getName() + " (completed)\n";
		}

		return temp;

	}

}
