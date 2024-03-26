package org.example;

import lombok.Data;

interface IDamagePenalty {
    Penalty calculatePenalty();
}