package mylombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import lombok.val;

public class LombokVal {
	public static void main(String[] args) {
		try {
			System.out.println("** Lombok **");
			System.out.println("Example 1: " + LombokVal.example1());
			System.out.println("Example2: ");
			LombokVal.example2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String example1() {

		val example = new ArrayList<String>();
		example.add("Hello, World!");
		example.add("Bye, bye");
		example.add("This is an Example");
		example.add("Hola Mundo");
		example.add("Adios, adios");

		val random = new Random();
		int position = random.nextInt(example.size() - 1);
		val foo = example.get(position);

		return foo;
	}

	private static void example2() {
		val map = new HashMap<Integer, String>();
		map.put(0, "Zero");
		map.put(5, "five");

		for(val entry : map.entrySet()) {
			System.out.printf("\t%d: %s\n", entry.getKey(), entry.getValue());
		}
	}
}
