package Sort;

public class Quicksort {
	public static int[] quickSortWrapper(int arr[]){
		arr  = quick_Sort(arr, 0, arr.length-1);
		return arr;
	}
	private static int[] quick_Sort(int arr[],int start,int end){
		if(start<end)
		{
			int pivot = partition(arr,start,end);
			quick_Sort(arr,start,pivot-1);
			quick_Sort(arr, pivot+1, end);
		}
		return arr;
	}
	
	private static int partition(int arr[],int start,int end){
		int pivot = start; 
		int lh = start+1;
		int rh = end;
		while(true)
		{
			while(rh>lh && arr[rh]>=arr[pivot])rh--;
			while(lh<rh && arr[lh]<arr[pivot])lh++;
			if(lh==rh)break;
			genericUtilities.swap(arr, lh, rh);
		}
		if(arr[pivot]<=arr[lh])
		return pivot;
		genericUtilities.swap(arr, pivot, lh);
		return lh;
	}

}
