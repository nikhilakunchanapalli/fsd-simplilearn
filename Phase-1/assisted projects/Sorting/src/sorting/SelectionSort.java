package sorting;



public class SelectionSort {
	
	public static void main(String[] args) {

	    int[] arr = {2,5,1,6,4,9,3};
	    int length = arr.length;
	    selectionSort(arr);
	    System.out.println("The sorted elements are:");
	    for(int i:arr){

	        System.out.println(i);
	         }
	     }

	    public static void selectionSort(int[] arr){

	        for(int i=0;i<arr.length-1;i++){

	            int index =i;//beggining of array

	            for(int j=i+1;j<arr.length;j++){
	                if(arr[j]<arr[index]){

	                    index =j; //smallest index
	                }

	            }
	            int smallNumber = arr[index];
	            arr[index]= arr[i];
	            arr[i]= smallNumber;

	            for(int x:arr) {System.out.print(x);   } System.out.println(); 

}
	    }
}

