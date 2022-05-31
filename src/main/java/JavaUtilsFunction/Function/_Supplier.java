package JavaUtilsFunction.Function;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(returnListOfIntegers.get());
    }
    static Supplier<List<Integer>> returnListOfIntegers =
            () -> List.of(1, 2, 3, 4, 5);
}
