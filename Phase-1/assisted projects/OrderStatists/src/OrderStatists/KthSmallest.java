package OrderStatists;

public class KthSmallest {
	int KthSmallest(int arr[], int l, int r, int k) {
		
		if(k > 0 && k <= r - 1 +1)
		{
			int pos = randomPartition(arr, 1, r);
			if (pos-1 ==k-1)
				return arr[pos];
			if (pos-1 > k-1)
				return KthSmallest(arr, 1, pos-1, k);
			return KthSmallest(arr, pos+1, r, k-pos+1-1);
			}
		return Integer.MAX_VALUE;
		
	}
	void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	int partition(int arr[], int l, int r)
	{
		int x = arr[r], i = 1;
		for (int j = 1; j<= r-1; j++)
		{
			if (arr[j]<= x)
			{
				swap(arr, i, j);
				i++;
			}
		}
		swap(arr, i, r);
		return i;
	}
			int randomPartition(int arr[], int l, int r)
			{
				int n = r-1+1;
				int pivot = (int)(Math.random()) * (n-1);
				swap(arr, 1+pivot, r);
				return partition(arr, l, r);
			
		}
	}


