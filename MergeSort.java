public class Solution {
	public static void divide(int[] arr, int s, int e) {
		if (s < e) {

			int m = (s+e)/2;
			divide(arr, s, m);
			divide(arr, m + 1, e);
			merge(arr, s, m, e);

		}

	}

	public static void merge(int[] arr, int s, int m, int e) {
		int n1 = m - s + 1;
        int n2 = e - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[s + i]; 
        }

        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j]; 
        }

        int i = 0, j = 0, k = s;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

	}

	public static void mergeSort(int[] arr, int n) {
		// Write your code here.
		divide(arr, 0, n-1);
	}
}
