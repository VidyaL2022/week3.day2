package week3.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int size = data.length;
		System.out.println("Sorted Arrays are: "+ Arrays.toString(data));
		int res = data[size-2];	
		System.out.println("Second Largest Number:"+res);
	}

}
