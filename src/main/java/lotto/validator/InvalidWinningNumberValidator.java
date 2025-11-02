package lotto.validator;

import java.util.regex.Pattern;

public class InvalidWinningNumberValidator {

    private final static String REGEX = "^[0-9,]+$";

    private InvalidWinningNumberValidator() {

    }

    public static void validateWinningNumber(String numbers) {
        if(!Pattern.matches(REGEX, numbers)) {
            throw new IllegalArgumentException("[ERROR] 정수 혹은 구분자만 입력 가능합니다.");
        }
    }

}
