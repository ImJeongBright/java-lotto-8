package lotto.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

import static lotto.util.constant.LottoConstant.*;

public class RandomNumberGenerator {

    private RandomNumberGenerator() {
    }

    public static List<Integer> issueLottoNumber() {
        return Randoms.pickUniqueNumbersInRange(LOTTO_START_NUMBER, LOTTO_END_NUMBER, LOTTO_COUNT)
                .stream()
                .sorted()
                .toList();
    }

}
