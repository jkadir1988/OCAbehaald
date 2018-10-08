public class Demo { 
	public static void main(String[] args) {
		Student student1 = new Student();
		
		
		Student student2 = new Student();
		
		student1.vullen(65, "Javiel");
		student2.vullen(64, "Jusreiza");
		
		controleren(student1);
		controleren(student2);
		
	}
	static void controleren(Student student) {
		if (student.cijfer > 64) {
			System.out.println(student.voornaam + " is geslaagd en heeft een " + student.cijfer + "% gehaald!");
		} else {
			System.out.println(student.voornaam + " is gezakt en heeft een " + student.cijfer + "% gehaald!");
		}
	}
}

class Student{
	int cijfer;
	String voornaam;
	
	void vullen (int getal, String naamvoor) {
		cijfer = getal;
		voornaam = naamvoor;
	}
	
}
