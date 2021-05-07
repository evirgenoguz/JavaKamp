package gun3Odev2;

public class StudentManager {
	
	public void addLesson(User student, String lessonName) {
		((Student) student).getLessons().add(lessonName);
		System.out.println("��renci " + lessonName + " dersini aldi.");
	}
	
	public void deleteLesson(User student, String lessonName) {
		for(String lesson : ((Student) student).getLessons()) {
			if(lesson == lessonName) {
				((Student) student).getLessons().remove(lessonName);
			}
		}
		System.out.println("��renci " + lessonName + " dersini b�rakt�");
	}
}
