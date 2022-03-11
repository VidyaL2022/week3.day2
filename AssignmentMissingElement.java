package week3.day2;

import java.util.Arrays;

public class AssignmentMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		System.out.println("Sorted Array are:" + Arrays.toString(arr));
		for(int i=0; i<arr.length-1; i++) {
			if((arr[i]+1)!=arr[i+1]) {
				System.out.println(arr[i]+1);
			}
		}
	}
}
