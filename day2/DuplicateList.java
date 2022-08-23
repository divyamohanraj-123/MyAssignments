package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the input as duplicateValue
		int[] duplicateValue= {4,3,6,8,29,1,2,4,7,8};
		//Declare a Set as uniqueValue
		Set<Integer> uniqueValue=new TreeSet<Integer>();
		//Iterate through for loop
		for(int j=0;j<duplicateValue.length;j++) {
			//Add every element into Set
			if(uniqueValue.add(duplicateValue[j])==false) {
				//If it is already there in the Set -> Print duplicate
				System.out.println("Duplicate values:"+duplicateValue[j]);
			}else
				if(uniqueValue.add(duplicateValue[j])==true){
					System.out.println("Unique values:"+uniqueValue);
				}
		}	

	}

}

