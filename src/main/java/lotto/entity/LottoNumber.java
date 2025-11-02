package lotto.entity;

import lotto.util.RandomNumberGenerator;

import java.util.Collections;
import java.util.List;

public class LottoNumber {
    private final List<Lotto> lottos;

    public LottoNumber(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public List<Lotto> saveLottoNumbers(int issueCount) {

        for(int st = 0 ; st < issueCount; st++) {
            List<Integer> numbers = RandomNumberGenerator.issueLottoNumber();
            Lotto lotto = new Lotto(numbers);

            lottos.add(lotto);
        }

        return Collections.unmodifiableList(lottos);
    }

}
