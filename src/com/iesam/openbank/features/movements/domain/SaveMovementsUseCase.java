package com.iesam.openbank.features.movements.domain;

public class SaveMovementsUseCase {
    private MovementsRepository movementsRepository;

    public SaveMovementsUseCase(MovementsRepository movementsRepository) {
        this.movementsRepository = movementsRepository;
    }
    public void execute(Movements movements){
        movementsRepository.saveMovements(movements);
    }
}
