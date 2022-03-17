package OrderStatists;

public class Main {
	public static void main(String[] args) {
		KthSmallest ob = new KthSmallest ();
		int arr[] = {42,13,25,49,14,38,26};
		int n = arr.length,k= 4;
		System.out.println("K'th Smallest element is "+ ob. KthSmallest(arr, 0, n-1, k));
	}

}
