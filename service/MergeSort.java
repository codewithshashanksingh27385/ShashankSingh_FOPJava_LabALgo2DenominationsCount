package service;

public class MergeSort {
	public static void sort(int[] arr, int left, int right) {
		if (right > left) {
			int middle = (left + right) / 2; // left+((right-left)/2)
			sort(arr, left, middle);
			sort(arr, middle + 1, right);
			sortAndMerge(arr, left, middle, right);
		}

	}

	static void sortAndMerge(int[] arr, int left, int middle, int right) {

		int n1 = middle - left + 1;
		int n2 = right - middle + 1;

		int[] leftTempArr = new int[n1];
		int[] rightTempArr = new int[n2];

		// insert data
		for (int i = 0; i < n1; ++i) {
			leftTempArr[i] = arr[left + i];
		}
		// insert data
		for (int i = 0; i < n2-1; ++i) {
			rightTempArr[i] = arr[middle + 1 + i];
		}

		// leftTempArr[middle-left+1]=Integer.MIN_VALUE;
		// rightTempArr[right-middle]=Integer.MIN_VALUE;

		// two pointer check
		int i = 0, j = 0;

		int k = left;
		while (i < n1 && j < n2) {
			if (leftTempArr[i] >= rightTempArr[j]) {
				arr[k] = leftTempArr[i];
				i++;
			} else {
				arr[k] = rightTempArr[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = leftTempArr[i];
			i++;
			k++;
		}
		while (j < n2-1) {
			arr[k] = rightTempArr[j];
			j++;
			k++;
		}
	}

}
