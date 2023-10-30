package main;

public class Quiz7 {

	public static void main(String[] args) {

		Person person = new Person();
		person.method1("둘리");
		person.method2(30);
		person.method3(true);

//		person.name = "둘리";
//		person.age = 30;
//		person.isMarried = true;

		person.showInfo();

	}

}

class Person {

	String name;
	int age;
	boolean isMarried;

	public void method1(String n) {
		 name = n;    //-> String 빼야 함.

	}

	public void method2(int a) {
		age = a;		// int를 빼야 함.
	}

	public void method3(boolean m) {
		isMarried = m;		

	}

	public void showInfo() {
		System.out.println(name + "," + age + "," + isMarried);

	}
}
