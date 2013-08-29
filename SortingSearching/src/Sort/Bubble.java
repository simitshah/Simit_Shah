package Sort;

public class Bubble {
   public static int[] bubble_Sort(int arr[]){
	   for(int i=0;i<arr.length-1;i++)
	   {
		   for(int j=0;j<arr.length-i-1;j++)
		   {
			   if(arr[j]>arr[j+1]){
				   genericUtilities.swap(arr, j, j+1);
			   }
		   }
	   }
	   
	   return arr;
   }
}
