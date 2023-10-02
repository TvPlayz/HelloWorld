package day30_constructor;

public class StudentObject {

	public static void main(String[] args) {
	
		Student student1 = new Student();
		Student student2 = new Student();

		System.out.println(student1.getInfo());
		System.out.println(student2.getInfo());
		
		student1.name = "Rinat";
		student1.age = 20;
		student1.gender ='M';
		student1.studentId = 234567;
		
		System.out.println(student1.getInfo());
	}

}
