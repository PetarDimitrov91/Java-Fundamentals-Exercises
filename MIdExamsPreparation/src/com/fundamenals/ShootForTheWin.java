package com.fundamenals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<Integer> targets = Arrays.stream(console.nextLine().split("\\s+"))
				.map(Integer::parseInt).collect(Collectors.toList());
		int schootingCounter = 0;
		String command = console.nextLine();
		while (!command.equals("End")) {
			int index = Integer.parseInt(command);
			if (index > targets.size() - 1 || targets.get(index) == -1) {
				command=console.nextLine();
				continue;
			} else {
				int targetAtIndex = targets.get(index);
				targets.set(index, -1);
				schootingCounter++;
				for (int i = 0; i < targets.size(); i++) {
					int currentTarget = targets.get(i);
					if (currentTarget != -1 && currentTarget > targetAtIndex) {
						currentTarget -= targetAtIndex;
						targets.set(i, currentTarget);
					} else if (currentTarget != -1) {
						currentTarget += targetAtIndex;
						targets.set(i, currentTarget);
					}
				}
			}
			command = console.nextLine();
		}
		String endTargets = targets.toString().replaceAll("[\\[\\],]", "");
		System.out.printf("Shot targets: %d -> %s", schootingCounter, endTargets);
	}
}
