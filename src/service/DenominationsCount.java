package service;

public class DenominationsCount { // 20, 10, 5, 1

	public void notesCountImplementation(int[] notes, int amount) { // 60

		int[] noteCounter = new int[notes.length];

		for (int i = 0; i < notes.length; i++) {
			if (amount > notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount - noteCounter[i] * notes[i];
			}
		}

		if (amount > 0) {
			System.out.println("exact amount cannot be given with the highest denomination");
		} else {
			for (int i = 0; i < notes.length; i++) {
				if (noteCounter[i] != 0) {
					System.out.println(notes[i] + ":" + noteCounter[i]);
				}
			}
		}
	}

}
