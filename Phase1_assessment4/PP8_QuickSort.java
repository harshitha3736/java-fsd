package Phase1_assessment4;

public class PP8_QuickSort {
	int partition(int arr[], int low, int high)
	{
		int pivot=arr[high];
		int i=(low-1);
		for(int j=low;j<high;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				
				//swapping arr[i] amd arr[j]
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		//swapping arr[i+1] and arr[high] (or pivot)
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return i+1;
	}
	
	void sort(int arr[], int low, int high)
	{
		if(low<high)
		{
			int p=partition(arr, low, high);
			
			sort(arr, low,p-1);
			sort(arr, p+1, high);
		}
	}
	static void printArray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]= {14, 27, 55, 60, 12, 7, 3, 9, 11};
		int n=arr.length;
		
		PP8_QuickSort ob=new PP8_QuickSort();
		ob.sort(arr, 0, n-1);
		
		System.out.println("Sorted Array");
		printArray(arr);

	}

}

