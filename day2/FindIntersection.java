package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare An Array for {3,2,11,4,6,7};	
		int[] inputOne={3,2,11,4,6,7};
		// Declare another Array for {1,2,8,4,9,7};
		int[] inputTwo={1,2,8,4,9,7};
		//create a two empty Lists - list1 & list2
		List<Integer>list1=new ArrayList<Integer>();
		List<Integer>list2=new ArrayList<Integer>();
		//Declare for loop iterator from 0 to array a.length and add into list1
		for(int i=0;i<inputOne.length;i++) {
			list1.add(inputOne[i]);
		}
		//Declare for loop iterator from 0 to array b.length and add into another list2
		for(int j=0;j<inputTwo.length;j++) {
			list2.add(inputTwo[j]);
		}
		//Compare Both list1 & list2 using a nested for loop
		for(int i=0;i<inputOne.length;i++) {
			for(int j=0;j<inputTwo.length;j++) {
				if(list1.get(i)==list2.get(j)) {
					//Print the matching number
					System.out.println(list1.get(i));
				}
			}

		}
	}}