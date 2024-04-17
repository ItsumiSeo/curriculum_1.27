package curriculum1_27;

import java.util.Scanner;
import java.util.stream.Stream;

public class main {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Stream.of(scanner.nextLine().split(",")).map(record -> new animal(args)).forEach(System.out::println);
}
}