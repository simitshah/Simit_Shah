package Sort;


public class input {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int action = 2;
        int arr[] = {1,2,3,4,5,6,7,8,9};
        shuffleInput.shuffleMe(arr,action);
        //genericUtilities.print(arr);
        //arr = Bubble.bubble_Sort(arr);
        //arr = Quicksort.quickSortWrapper(arr);
        //arr = Insertion.insertion_Sort(arr);
        MyStack stk = new MyStack(3);
        stk.push(5);
        stk.push(7);
        stk.push(9);
        stk.push(7);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        MyQueue que = new MyQueue(3);
        que.enqueue(3);
        que.enqueue(2);
        que.enqueue(1);
        System.out.println(que.dequeue());
        que.enqueue(0);
        
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        //arr  = Selection.selection_Sort(arr);
        //genericUtilities.print(arr);
	}

}
