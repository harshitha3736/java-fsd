package Phase1_assessment4;

public class PP4_SelectionSort {
	public static void main(String[] args) {
		int[] arr= {14,9,10,12,15,20,32};
		int length=arr.length;
		
		selectionSort(arr);
		
		System.out.println("The sorted elements are :");
		
		for(int i:arr) {
			System.out.print(i +"\t");
		}
	}
	
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int index =i;
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			int smallaNumber=arr[index];
			arr[index]=arr[i];
			arr[i]=smallaNumber;
			System.out.println("Sorting:");
			for(int x:arr) {
				
				System.out.print(x+",");
			}
			System.out.println();
		}

	}

}
