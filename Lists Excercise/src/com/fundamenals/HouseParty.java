package com.fundamenals;

import java.util.Scanner;
import java.util.*;

public class HouseParty {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int countOfCommands = Integer.parseInt(console.nextLine());
		List<String> guests = new ArrayList<>();
		for (int i = 0; i < countOfCommands; i++) {
			String[] commands = console.nextLine().split("\\s+");
			String name = commands[0];
			switch (commands[2]){
				case "going!":
					if(!guests.contains(name)){
						guests.add(name);
					}else {
						System.out.println(name + " is already in the list!");
					}
					break;
				case "not":
					if(guests.contains(name)){
						guests.remove(name);
					}else{
						System.out.println(name + " is not in the list!");
					}
					break;
			}
		}
		for (String guest : guests) {
			System.out.println(guest);

		}
	}
}
