package Sort;

public class MyQueue {
	private int curSize,front,rear,maxSize,arr[];
    public MyQueue(int s){
    	front = 0;
    	rear = 0;
    	maxSize = s;
    	curSize = 0;
    	arr = new int[maxSize];
    }
    public void enqueue(int num){
    	if(!isFull()){
	    	arr[front] = num;
	    	front = (front+1)%maxSize;
	    	curSize++;
    	}
    	else{
    		System.out.println("Queue is Full");
    	}
    }
    public int dequeue(){
    	if(!isEmpty()){
	    	int num = arr[rear];
	    	rear = (rear+1)%maxSize;
	    	curSize--;
	    	return num;
    	}
    	else{
    		System.out.println("Queue is Empty");
    		return -1;
    	}
    	
    }
    public boolean isEmpty(){
    	return (curSize==0);
    }
    public boolean isFull(){
    	return (curSize>=maxSize);
    }
}
