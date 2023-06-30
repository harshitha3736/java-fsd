package Phase1_assessment4;

import java.util.Scanner;

public class PP1_LinearSearch {
	public static void main(String[] args) {
		int[] arr= {20,30,40,50,60};
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the elements to be searched");
				
				int SearchValue=sc.nextInt();
				
				int result=linearing(arr, SearchValue);
				
				if(result==-1) {
					System.out.println("Element not found in the array");
				}
				else {
					System.out.println("Element found at index: ["+result+"] , and Search Key is :"+arr[result]);
				}
			}

			private static int linearing(int[] arr, int searchValue) {
				for(int i=0;i<arr.length;i++) {
					if(arr[i]==searchValue) {
						return i;
					}
				}
				return -1;

			}

		}
