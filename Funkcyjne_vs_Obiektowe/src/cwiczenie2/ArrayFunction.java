package cwiczenie2;

import java.util.function.Consumer;

public class ArrayFunction {

	public static void main(String args[]) {
		int[] numbers = { 1, 2, 30, 4, };

		doForEach(numbers, System.out::println);
		doForEach(numbers, new Consumer<Integer>() {
			@Override 
			// Tutaj tworzymy klase anonimowa:
			public void accept(Integer integer) {
				System.out.println("Jestem tutaj: " + integer);
			}
		});
		doForEach(numbers, (i) -> {
			System.out.println(i * i);
		});
		doForEach(numbers, ArrayFunction::multiplyAndPrint);
	}

	public static void doForEach(int[] tab, Consumer<Integer> task) {
		for (int n : tab) {
			task.accept(n);
		}
	}

	public static void multiplyAndPrint(int i) {
		System.out.println("To jest funkcja z nazwą: " + i * i);
	}
}
