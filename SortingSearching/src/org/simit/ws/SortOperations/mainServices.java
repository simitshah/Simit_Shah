package org.simit.ws.SortOperations;

public class mainServices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortOperationsSOAPStub stub = null;
		int[] in = {4,5,7,2,1};
		try{
			stub = new SortOperationsSOAPStub();
			stub.bubbleSort(in);
		}catch(Exception e){
			
		}

	}

}
