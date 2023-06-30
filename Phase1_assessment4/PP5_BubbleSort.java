package Phase1_assessment4;

public class PP5_BubbleSort {
	public static void main(String[] args) {
        int arr[]= {75,89,34,15,26};
		
		bubbleSort(arr);
		System.out.println("Final output after sorting:");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" \t");
		}
	}

	public static void bubbleSort(int[] arr) {
		int len=arr.length;
		int temp=0;
		for(int i=0;i<len;i++) {
			for(int j=1;j<(len);j++){
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					System.out.println("Sorting:");
					for(int x:arr) {
						System.out.print(x+" ");
					}
					System.out.println();
				}
			}
		}

	}

}

