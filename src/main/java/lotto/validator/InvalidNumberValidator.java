package lotto.validator;

public class InvalidNumberValidator {

    private InvalidNumberValidator() {
    }

    public static int validateNumber(String number) {

        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 정수만 입력 가능합니다.");
        }

    }
}
