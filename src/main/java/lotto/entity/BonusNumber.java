package lotto.entity;

import java.util.List;

public class BonusNumber {
    private final int bonusNumber;

    public BonusNumber(int bonusNumber) {
        this.bonusNumber = bonusNumber;
    }

    public boolean isBonusNumber(List<Integer> numbers) {
        for (Integer number : numbers) {
            if(number == bonusNumber) return true;
        }
        return false;
    }

}
