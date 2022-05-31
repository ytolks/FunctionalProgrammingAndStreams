package JavaUtilsFunction.Function.CombinatorPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alina"
                , "+37126395758"
                , "alina.tolka@gmail.com"
                , LocalDate.ofYearDay(1985, 79));

        //System.out.println(new CustomerValidatorService().isValid(customer));

        CustomerRegistrationValidator.ValidationResult result =
                CustomerRegistrationValidator.isEmailValid()
                        .and(CustomerRegistrationValidator.isAdult())
                        .and(CustomerRegistrationValidator.isNameLengthValid())
                        .and(CustomerRegistrationValidator.isPhoneNumberValid())
                        .apply(customer);
        System.out.println(result);
    }
}
