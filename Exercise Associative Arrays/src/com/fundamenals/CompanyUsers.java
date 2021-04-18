package com.fundamenals;

import java.util.*;

public class CompanyUsers {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		Map<String, List<String>> companyUsers = new TreeMap<>();
		String command = console.nextLine();
		while (!command.equals("End")) {
			String[] data = command.split(" -> ");
			String company = data[0];
			String id = data[1];
			if (!companyUsers.containsKey(company)) {
				companyUsers.put(company, new ArrayList<>());
				companyUsers.get(company).add(id);
			}
			List<String> list = companyUsers.get(company);
			if (idNotExist(id, list)) {
				companyUsers.get(company).add(id);
			}
			command = console.nextLine();
		}
		companyUsers.forEach((key, value) -> {
			System.out.println(key);
			value.forEach(id -> System.out.println("-- " + id));
		});
	}

	private static boolean idNotExist(String id, List<String> list) {
		for (String currentId : list) {
			if (currentId.equals(id)) {
				return false;
			}
		}
		return true;
	}


}
