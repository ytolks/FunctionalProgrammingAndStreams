package JavaUtilsFunction.Function;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(incrementBy2.apply(1));
    }

    static Function<Integer, Integer> incrementBy2 = number -> number + 2;
}
