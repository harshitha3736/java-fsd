package Phase1_assessment4;

public class PP6_InsertionSort {
	public static void main(String[] args) {
        int[] arr= {9, 3, 10, 5, 8};

		insertionSort(arr);
		System.out.println("Final output after sorting:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" \t");
		}
	}

	public static void insertionSort(int[] arr) {
		
		int len =arr.length;
		
		for(int j=1;j<len;j++) {
			
			int key=arr[j];
			int i=j-1;
		
		while((i>-1) && (arr[i]>key)) {
			arr[i+1]=arr[i];
			i--;
		}
		arr[i+1]=key;
		}

	}

}

