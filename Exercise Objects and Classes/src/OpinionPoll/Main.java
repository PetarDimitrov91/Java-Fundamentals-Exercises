package OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int n = Integer.parseInt(console.nextLine());
		List<Person> people = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			String personalData = console.nextLine();
			String name = personalData.split("\\s+")[0];
			int age = Integer.parseInt(personalData.split("\\s+")[1]);
			Person person = new Person(name,age);
			people.add(person);
		}
		List<Person> formatedList = people.stream().filter(p -> p.getAge() > 30).collect(Collectors.toList());
		people.sort(Comparator.comparing(Person::getName));

		for (Person person : formatedList) {
			System.out.println(person);
		}
	}
}
