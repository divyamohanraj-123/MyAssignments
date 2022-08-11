package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();

		System.out.println("Addition of three numbers:"+calculator.add(7, 5, 9));

		System.out.println("Subtraction of two numbers:"+calculator.sub(10, 7));

		System.out.println("Multilication of two numbers:"+calculator.mul(9, 6));

		System.out.println("Division of two numbers:"+calculator.divide(55,11 ));
	}

}
