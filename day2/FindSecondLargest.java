package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//Create a empty Set Using TreeSet
		Set<Integer> largestNum=new TreeSet<Integer>();
		//Declare for loop iterator from 0 to data.length and add into Set 
		for(int i=0;i<data.length;i++)
		{
			largestNum.add(data[i]);
		}
		//Print the second last element from Lst
		List<Integer> SecondLargest=new ArrayList<Integer>(largestNum);
		System.out.println(SecondLargest.get(SecondLargest.size()-2));
	}
}