package gun3Odev2;

public class InstructorManager {
	
	public void addLessons(User instructor, String lessonName) {
		((Instructor) instructor).getLessons().add(lessonName);
		System.out.println("E?itmene " + lessonName + " dersi atand?.");
	}
	
	public void deleteLeson(User instructor, String lessonName) {
		
		for(String lesson : ((Instructor) instructor).getLessons()) {
			if(lesson == lessonName) {
				((Instructor) instructor).getLessons().remove(lessonName);
			}
		}
		System.out.println(lessonName + " dersi e?itmenden silindi.");
	}
}
