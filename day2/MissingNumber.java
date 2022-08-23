package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the numbers from 1 to 10
		int[] data = {3,2,10,4,6,7,9,2,1,3,6,5};
		//Remove the duplicates using Set and make sure the set is in the ascending order
		Set<Integer> number=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			number.add(data[i]);
		}
		List<Integer> missingNumber=new ArrayList<Integer>(number);
		System.out.println(missingNumber);
		//Iterate from the starting number and verify the next number is + 1
		for(int j=0;j<missingNumber.size();j++) {
			//If did not match, that is the number
			if(missingNumber.get(j)!=(j+1))
			{
				System.out.println("Missing number is:"+(j+1));
				break;
			}
		}






	}

}
