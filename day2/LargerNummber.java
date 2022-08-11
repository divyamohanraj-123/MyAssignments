package week1.day2;

import java.util.Arrays;

public class LargerNummber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ] largestNum= {22,67,98,1,34,58,99};
		Arrays.sort(largestNum);
		int number=largestNum.length;
		System.out.println(number);

		int secondLargestNum = largestNum[number-2];
		System.out.println(secondLargestNum);

	}

}
