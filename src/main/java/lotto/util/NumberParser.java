package lotto.util;

public class NumberParser {

    private NumberParser() {
    }

    public static String[] parseNumber(String numbers) {
        return numbers.split(",");
    }

}
