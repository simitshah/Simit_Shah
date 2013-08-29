package Sort;

public class shuffleInput {
	//Action = 1 --> Sorted
	//Action = 2 --> Reverse Sorted
	//Action = 3 --> Shuffle
	public static int[] shuffleMe(int arr[],int action){
		switch(action)
		{
			case 1: break; //Sorted
			
			case 2:       //Reverse Sorted
				   int start=0,end=arr.length-1;
				   while(start<end){
					int temp = arr[start];
					arr[start++] = arr[end];
					arr[end--] = temp;
					
				   }
				   break;
			case 3:       //Shuffle Input
					int times = (int)(Math.random()*arr.length);
					for(int i = 0; i<times;i++){
						int pos1 = (int)(Math.random()*arr.length);
						int pos2 = (int)(Math.random()*arr.length);
						
						int temp = arr[pos1];
						arr[pos1] = arr[pos2];
						arr[pos2] = temp;
						
					}
					break;
		}
		
		
		return arr;
	}

}
