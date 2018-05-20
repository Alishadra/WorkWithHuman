package org.itstep.model;

public class AppRunner {

	private static final String String = null;

	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		
		teacher.setName("Alex");
		teacher.setSurname("Ignatenko");
		teacher.setAge(35);
		
		Teacher teacher2 = new Teacher("Lesik", "Piddervyanskiy", 50);
		System.out.println("Мой преподаватель " + teacher.getName() + " " + teacher.getSurname() + " ему " + teacher.getAge());
		System.out.println("Мой преподаватель на замене " + teacher2.getName() + " " + teacher2.getSurname() + " " + "ему" + " " + teacher2.getAge());

		
		Student student = new Student("name", "surname", 35);
		
		student.setName("Alex");
		student.setSurname("Babich");
		student.setAge(31);
		
		System.out.println("Я студент" + " " + student.getName() + " " + student.getSurname() + " " + "Мой возраст" + student.getAge());
		}
		

}
