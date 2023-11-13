package main2;

public class Quiz5 {

	public static void main(String[] args) {

		Ballpen ballpen = new Ballpen();
		ballpen.width = 2;
		ballpen.amount = 100;
		ballpen.color = "파랑색";

		FountainPen fountainPen = new FountainPen();
		fountainPen.width = 3;
		fountainPen.amount = 80;
		fountainPen.brand = "몽블랑";

		System.out.println(ballpen.width + " " + ballpen.amount + " " + ballpen.color);
		System.out.println(fountainPen.width + " " + fountainPen.amount + " " + fountainPen.brand);
	}

}

class Pen {
	int width;
	int amount;
}

class Ballpen extends Pen {
	String color;
}

class FountainPen extends Pen {
	String brand;
}