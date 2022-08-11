package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n = 13,count=0;


		System.out.println("Enter any number:"+n);

		for(int i=1;i<=n;i++) {

			if(n%i==0) 
				count++;

		}

		if(count==2)

			System.out.println("It is a prime number");
		else

			System.out.println("It is not a prime number");

	}




}
