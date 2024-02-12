package com.iesam.openbank.features.movements.presentation;

import com.iesam.openbank.features.movements.data.MovementsDataRepository;
import com.iesam.openbank.features.movements.domain.Movements;
import com.iesam.openbank.features.movements.domain.SaveMovementsUseCase;

public class MainMovements {
    public static void createMovements(Movements movements){
        MovementsDataRepository movementsDataRepository= MovementsDataRepository.newInstance();
        SaveMovementsUseCase saveMovementsUseCase = new SaveMovementsUseCase(movementsDataRepository);
        saveMovementsUseCase.execute(movements);
    }
}
