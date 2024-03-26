package org.example;

public class DamagePenaltyCalculator implements IDamagePenalty {
    @Override
    public Penalty calculatePenalty() {
        Penalty tmp = new Penalty();
        tmp.setReason("Damage Item");
        return tmp;
    }
}
