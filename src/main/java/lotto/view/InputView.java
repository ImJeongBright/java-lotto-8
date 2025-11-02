package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private InputView() {}

    public static int inputPrice() {
        return Integer.parseInt(Console.readLine());
    }

    public static int inputBonusNumber() {
        return Integer.parseInt(Console.readLine());
    }

    public static String inputWinningNumbers() {
        return Console.readLine();
    }

}
