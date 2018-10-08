public class Demo { 
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.cijfer = 64;
		student1.voornaam = "Javiel";
		
		Student student2 = new Student();
		student2.cijfer = 65;
		student2.voornaam = "Jusreiza";
		
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
	
}
