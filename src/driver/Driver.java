package driver;

import java.util.Scanner;

import service.DenominationsCount;
import service.MergeSort;

public class Driver {

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		// int[] arr=new int[5];
		// arr[0]=1;
		// arr[1]=2;
		// arr[2]=3;
		// arr[3]=4;
		// arr[4]=5;
		// mergeSort.sort(arr, 0, arr.length-1);

		// for(int i:arr) {
		// System.out.println(i);
		// }

		DenominationsCount dc = new DenominationsCount();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations");

		int totalDenominations = sc.nextInt();

		System.out.println("enter the currency denominations value");

		int[] notes = new int[totalDenominations];
		for (int i = 0; i < totalDenominations; i++) {
			notes[i] = sc.nextInt();
		}

		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSort.sort(notes, 0, notes.length - 1);
		dc.notesCountImplementation(notes, amount);

	}

}
