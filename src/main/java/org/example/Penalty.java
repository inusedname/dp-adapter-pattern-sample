package org.example;

import lombok.Data;

@Data
public class Penalty {
    private String reason;
    private Double valueDamaged;
    private Boolean sendAlertToManager = false;
}
