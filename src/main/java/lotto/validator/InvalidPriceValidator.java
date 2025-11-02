package lotto.validator;

public class InvalidPriceValidator {

    private static final int PRICE_STANDARD = 1000;

    private InvalidPriceValidator() {

    }

    public static void validatePrice(int price) {
        if(price % PRICE_STANDARD != 0) {
            throw new IllegalArgumentException("[ERROR] 1000원 단위만 입력 가능합니다.");
        }
    }

    private void validatePriceMinimum(int price) {
        if (price < PRICE_STANDARD) {
            throw new IllegalArgumentException("[ERROR] 최소 구매 금액은 1,000원입니다.");
        }
    }

}
