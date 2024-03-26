package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        /*Before*/
        IDamagePenalty calculator = new DamagePenaltyCalculator();
        Penalty penaltyA = calculator.calculatePenalty();
        System.out.println(penaltyA.getReason());

        /*After*/
        calculator = new OverdueDamagePenaltyCalcAdapter(
                new OverduePenaltyCalculator()
        );
        ((OverdueDamagePenaltyCalcAdapter) calculator)
                .setDueDate(LocalDateTime.now().minusDays(30));
        Penalty penaltyB = calculator.calculatePenalty();
        System.out.println(penaltyB.getReason());
    }
}