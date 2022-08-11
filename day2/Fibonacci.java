package week1.day2;

public class Fibonacci {
	public static void main(String[] args) {
		int firstNum=0;
		int secNum=1;
		int sum=0;
		System.out.println(firstNum+" "+secNum);
		for(int i=2;i<11;i++) {
			//System.out.println(i);
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println("Fibonacci series:"+sum);
		}
		//System.out.println("Fibonacci series:"+sum);
	}

}
