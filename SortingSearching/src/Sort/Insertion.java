package Sort;

public class Insertion {
    public static int[] insertion_Sort(int arr[]){
    	for(int i =0;i<arr.length;i++){
    		int j,min  = arr[i];
    		for(j=i-1;j>=0;j--)
    		{
    			if(arr[j]>min)
    			{
    				arr[j+1] = arr[j];
    			}
    			else
    				break;
    		}
    		arr[j+1] = min;
    	}
    	return arr;
    }
}
