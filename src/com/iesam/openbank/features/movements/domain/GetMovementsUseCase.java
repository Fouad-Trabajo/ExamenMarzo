package com.iesam.openbank.features.movements.domain;

public class GetMovementsUseCase {

    private MovementsRepository movementsRepository;

    public GetMovementsUseCase(MovementsRepository movementsRepository) {
        this.movementsRepository = movementsRepository;
    }
    public Movements execute(String pago){
        return this.movementsRepository.obtainPago(pago);
    }
}
