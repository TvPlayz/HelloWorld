package day29_ClassAndObject;

public class StudentObject {

	public static void main(String[] args) {

		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
//		Student student1   reference type is Student.class reference variable is student1
		// new Student() --> creating student object\
		
		student1.name = "John";
		student1.age = 12;
		student1.gender ='M';
		student1.grade = 7;
		student1.ID = 123456;
		
		student1.study();
		student1.eating();
		student1.sleeping();
		System.out.println(student1.getInfo());
		
		student2.name = "Sophia";
		student2.age = 10;
		student2.gender = 'F';
		student2.grade = 5;
		student2.ID = 654321;
		
		student2.study();
		student2.eating();
		student2.sleeping();
		System.out.println(student2.getInfo());
		
		student3.name = "Lily";
		student3.age = 11;
		student3.gender = 'F';
		student3.grade = 6;
		student3.ID = 420691;
		
		student3.study();
		student3.eating();
		student3.sleeping();
		System.out.println(student3.getInfo());
		
		
		
		
		
		
		
		
	}

}
