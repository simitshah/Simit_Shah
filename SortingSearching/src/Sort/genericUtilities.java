package Sort;

public class genericUtilities {
	
	public static void  print(int arr[]){
	
		 for(int i:arr)
		        System.out.print(i+"-");
		 System.out.println(); 
	}
	
	public static void swap(int arr[],int pos1,int pos2){
		   int temp = arr[pos1];
		   arr[pos1] = arr[pos2];
		   arr[pos2] = temp;
	}

}
