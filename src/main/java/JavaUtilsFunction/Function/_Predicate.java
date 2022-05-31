package JavaUtilsFunction.Function;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(phoneNumberPredicate.test(11));
        System.out.println(phoneNumberPredicate
                .and(phoneNumberEqualsTo13).test(13));
    }


    static Predicate<Integer> phoneNumberPredicate = phoneNumber->
            phoneNumber > 12;
    static Predicate<Integer> phoneNumberEqualsTo13 = phoneNumber->
            phoneNumber == 13;

}
