package week1.day2;

public class CarProblem {
	public void printCarBrand() {
		System.out.println("Maruti");
	}
	public String getCarColor() {
		return "Blue";
	}
	public int getEngineNumber() {
		return 76868;

	}
	public  int calculateSub(int a,int b) {
		int c=a-b;
		return c;
	}
	public  int calculateMultiply(int a,int b) {
		int c=a*b;
		return c;
	}

	public  int calculateDivide(int a,int b) {
		int c=a/b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarProblem car=new CarProblem();
		car.printCarBrand();
		System.out.println(car.getCarColor());
		System.out.println(car.getEngineNumber());
		System.out.println(car.calculateSub(5,3));
		System.out.println(car.calculateMultiply(4, 3));
		System.out.println(car.calculateDivide(4,2));
	}

}
