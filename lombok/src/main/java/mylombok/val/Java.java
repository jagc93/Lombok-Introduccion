package mylombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Java {

	public static void main(String[] args) {
		try {
			System.out.println("** Java **");
			System.out.println("Example 1: " + Java.example1());
			System.out.println("Example2: ");
			Java.example2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String example1() {

		final List<String> example = new ArrayList<String>();
		example.add("Hello, World!");
		example.add("Bye, bye");
		example.add("This is an Example");
		example.add("Hola Mundo");
		example.add("Adios, adios");

		final Random random = new Random();
		final int position = random.nextInt(example.size() - 1);
		final String foo = example.get(position);

		return foo;
	}
	
	private static void example2() {
		final Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "Zero");
		map.put(5, "five");
		
		for(final Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.printf("\t%d: %s\n", entry.getKey(), entry.getValue());
		}
	}
}
