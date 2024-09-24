package week6.day1;

public class Student {

	public void getStudentsInfo(int Id) {
		System.out.println("Student ID:" + Id);

	}

	public void getStudentsInfo(int Id, String name) {
		System.out.println("Student Id:"+Id+  "Name:"  +name);

	}

	public void getStudentsInfo(String email, long phonenumber) {
		System.out.println("E-mail:" +email  + "Ph.num:"  + phonenumber);

	}

	public static void main(String[] args) {

		Student obj = new Student();
		obj.getStudentsInfo(10);
		obj.getStudentsInfo(10, "Dhanush");
		obj.getStudentsInfo("dhanush124@gmail.com", 9597004915l);

	}
}
