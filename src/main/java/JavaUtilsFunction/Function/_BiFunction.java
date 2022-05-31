package JavaUtilsFunction.Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _BiFunction {
    public static void main(String[] args) {
        System.out.println(sumOfTwoNumbers.apply(1, 10));
        System.out.println(multiplyTwoNumbers.apply(2, 12));
        System.out.println(sumTwoNumbersAndThenIncrementBy3.apply(3, 3));
    }

    // BiFunction 2 argument and 1 result
    static Function<Integer, Integer> multiplyBy3 = (number) -> number * 3;
    static BiFunction<Integer, Integer, Integer> sumOfTwoNumbers = (number, number1) -> number + number1;

    static BiFunction<Integer, Integer, Integer> multiplyTwoNumbers = (number, number1) -> number * number1;
    static BiFunction<Integer, Integer, Integer> sumTwoNumbersAndThenIncrementBy3 =
            sumOfTwoNumbers.andThen(multiplyBy3);

}
