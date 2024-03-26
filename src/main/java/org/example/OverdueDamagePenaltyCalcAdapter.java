package org.example;

import lombok.Setter;

import java.time.LocalDateTime;

public class OverdueDamagePenaltyCalcAdapter implements IDamagePenalty {

    @Setter
    private LocalDateTime dueDate;
    private final OverduePenaltyCalculator calculator;

    public OverdueDamagePenaltyCalcAdapter(OverduePenaltyCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public Penalty calculatePenalty() {
        return calculator.calculatePenalty(dueDate);
    }
}
