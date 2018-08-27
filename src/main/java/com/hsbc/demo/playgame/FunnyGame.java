package com.hsbc.demo.playgame;

import java.util.ArrayList;
import java.util.List;

public class FunnyGame {

	private List<String> pupils = null;
	private int numOfStudent = 1;
	private String gameRule = "";
	public static final String RULE_FIR = "R1";
	public static final String RULE_SED = "R2";

	public FunnyGame(final int numOfStudent, final String gameRule) {
		this.numOfStudent = numOfStudent;
		this.gameRule = gameRule;

	}

	public void launchGame() {
		int round = 1;
		int sequence = 1;
		specifyPlayer(numOfStudent);
		while (round <= 3) {
			for (String pupil : pupils) {
				System.out.println(pupil + ":" + gameBaseRule(sequence, gameRule));
				sequence++;
				if (sequence > 100) {
					System.out.println("****************Round:" + round + "****************");
					sequence = 1;
					round++;
					if (round == 4) {
						System.out.println("****************Ringup:finish****************");
						break;
					}
				}
			}
		}
	}

	private void specifyPlayer(int num) {
		this.pupils = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			pupils.add("Student" + i);
		}
	}

	private String gameBaseRule(int num, String gameRule) {
		if (RULE_FIR.equals(gameRule)) {
			if (num % 3 == 0 && num % 5 == 0) {
				return "FizzBuzz";
			}
			if (num % 3 == 0) {
				return "Fizz";
			}
			if (num % 5 == 0) {
				return "Buzz";
			}
		}

		if (RULE_SED.equals(gameRule)) {
			String numFormat = String.valueOf(num);
			if ((num % 3 == 0 && num % 5 == 0) || (numFormat.contains("3") && numFormat.contains("5"))) {
				return "FizzBuzz";
			}
			if (num % 3 == 0 || numFormat.contains("3")) {
				return "Fizz";
			}
			if (num % 5 == 0 || numFormat.contains("5")) {
				return "Buzz";
			}
		}
		return String.valueOf(num);
	}
}
