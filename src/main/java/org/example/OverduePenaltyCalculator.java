package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class OverduePenaltyCalculator {
    private static final double finePerDay = 100;

    Penalty calculatePenalty(LocalDateTime dueDate) {
        Duration durationPassed = Duration.between(dueDate, LocalDateTime.now());
        long dayPassed = durationPassed.toDays();
        Penalty tmp = new Penalty();

        if (dayPassed > 30) {
            tmp.setSendAlertToManager(true);
        }
        tmp.setReason("Overdue Penalty");
        tmp.setValueDamaged(finePerDay * dayPassed);
        return tmp;
    }
}
