package main2;

import java.util.ArrayList;

public class Quiz6 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();

		Person person1 = new Person("둘리");
		Person person2 = new Person("또치");

		list.add(person1);
		list.add(person2);

	}
}

class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public void eat() {
		System.out.println("밥을 먹는다");

	}

}

class Student1 extends Person {

	public Student1(String name) {
		super(name);
	}

	public void study() {
		System.out.println("공부를 한다");
	}

}

class Employee extends Person {

	public Employee(String name) {
		super(name);

	}

	public void work() {
		System.out.println("일을 한다");
	}

	public void showInfo() {
		System.out.println(name + "가 " + "일을 한다");

	}
}
