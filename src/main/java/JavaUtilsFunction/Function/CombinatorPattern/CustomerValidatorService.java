package JavaUtilsFunction.Function.CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    private boolean isNameLengthValid(String name) {
        return name.length() > 2;
    }

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.contains("+371");
    }

    private boolean isAdult(LocalDate dateOfBirth) {
        return Period.between(dateOfBirth, LocalDate.now()).getYears() > 16;
    }

    public boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail())
                && isNameLengthValid(customer.getName())
                && isPhoneNumberValid(customer.getPhoneNumber())
                && isAdult(customer.getDateOfBirth());

    }
}
