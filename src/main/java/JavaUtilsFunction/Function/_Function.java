package JavaUtilsFunction.Function;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(incrementBy2.apply(1));
        System.out.println(multiplyBy9.apply(1));
        System.out.println(incrementBy2AndMultiplyBy9.apply(1));
    }
// Function 1 argument and 1 result
    static Function<Integer, Integer> incrementBy2 = number -> number + 2;
    static Function<Integer, Integer> multiplyBy9 = number -> number * 9;
static Function<Integer,Integer> incrementBy2AndMultiplyBy9 =
        incrementBy2.andThen(multiplyBy9);
}
