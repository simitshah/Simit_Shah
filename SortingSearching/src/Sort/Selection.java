package Sort;

public class Selection {
     public static int [] selection_Sort(int arr[]){
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 int minIndex = i;
    		 for(int j=i+1;j<arr.length;j++)
    		 {
    			 if(arr[j]<arr[minIndex])
    				 minIndex = j;
    		 }
    		 genericUtilities.swap(arr, i, minIndex);
    	 }
    	 return arr;
     }
}
