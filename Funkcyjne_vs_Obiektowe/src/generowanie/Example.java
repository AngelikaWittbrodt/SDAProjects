package generowanie;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example {

	public static void main(String[] args) {

		Function<Integer, Double> divideByTwo = (Integer i) -> {
			double result = i / 2.0;
			return result;
		};
		System.out.println(divideByTwo.apply(6));

		Consumer<Double> consumer = System.out::println;
		consumer.accept(10.0);

		Predicate<String> longerThanFive = text -> text.length() > 5;
		System.out.println(longerThanFive.test("hahgfa"));
		System.out.println(longerThanFive.test("Nana"));
		
		//divideByTwo.andThen((number) -> number%2==0)
		
	}

}
