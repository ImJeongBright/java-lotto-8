package lotto.entity;

public enum LottoRank {

    FIRST(6,false, 2_000_000_000),
    SECOND(5,true,30_000_000),
    THIRD(5, false, 1_500_00),
    FOURTH(4, false, 50_000),
    FIFTH(3, false, 5_000),
    NONE(0, false, 0);

    private final int matchCount;
    private final boolean checkBonusNumber;
    private final int winnings;


    LottoRank(int matchCount, boolean checkBonusNumber, int winnings) {
        this.matchCount = matchCount;
        this.checkBonusNumber = checkBonusNumber;
        this.winnings = winnings;
    }

    public LottoRank of(int matchCount, boolean checkBonusNumber) {

        if (matchCount == 6) {
            return FIRST;
        } else if (matchCount == 5 && checkBonusNumber) {
            return SECOND;
        } else if (matchCount == 5) {
            return THIRD;
        } else if(matchCount == 4) {
            return FOURTH;
        } else if(matchCount == 3) {
            return THIRD;
        }

        return NONE;
    }


    public int getWinnings() {
        return winnings;
    }
}
