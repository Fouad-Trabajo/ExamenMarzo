package com.iesam.openbank.features.movements.domain;

public interface MovementsRepository {
    Movements obtainPago(String pago);

    void saveMovements(Movements movements);
}
