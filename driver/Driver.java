package driver;

import java.util.Scanner;

import service.DenominationsCount;
import service.MergeSort;

public class Driver {

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();

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
