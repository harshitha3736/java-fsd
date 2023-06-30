package Phase1_assessment4;

import java.lang.reflect.Array;
import java.util.Arrays;


public class PP3_ExponentialSearch {
	public static void main(String[] args) {
		int arr[]= {5,10,15,20,25};
		int value=15;
		int outcome=exponentialSearch(arr,arr.length,value);
		
		if(outcome<0) {
			System.out.println("Element is not present in array");
		}
		else {
			System.out.println("Element found at index: "+outcome+", Key is :"+arr[outcome]);
		}
}

	private static int exponentialSearch(int[] arr, int length, int value) {
		
		if(arr[0]==value) {
			return 0;
		}
		
		int i=1;
		
		while(i<length && arr[i]<=value) {
			i=i*2;
		}
		return Arrays.binarySearch(arr , i/2, Math.min(i, length),value);

	}

}

