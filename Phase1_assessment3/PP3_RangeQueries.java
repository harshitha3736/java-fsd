package Phase1_assessment3;

import java.util.Scanner;

public class PP3_RangeQueries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		        int array[] = { 3, 7, 2, 5, 8, 9 }; 
		        int n = array.length; 

				System.out.print("Enter the value of L: ");
				int L = sc.nextInt();

				System.out.print("Enter the value of R: ");
				int R = sc.nextInt();

				if (L < 0 || R >= n || L > R) {
					System.out.println("Invalid range!");
				} else {
					int sum = 0;
					for (int i = L; i <= R; i++) {
						sum += array[i];
					}
					System.out.println("Sum of elements in the range [" + L + ", " + R + "] is: " + sum);
				}


			}

		}

