package com.iesam.openbank.features.movements.data;

import com.iesam.openbank.features.customer.data.CustomerDataRepository;
import com.iesam.openbank.features.movements.domain.Movements;
import com.iesam.openbank.features.movements.domain.MovementsRepository;

public class MovementsDataRepository implements MovementsRepository {

    private static CustomerDataRepository instance =null; //Instancia de patrón SingleTon

    //Método del patrón SingleTon
    public static MovementsDataRepository newInstance(){
        if (instance==null){
            instance= new CustomerDataRepository();
        }
        return instance;
    }

    @Override
    public Movements obtainPago(String pago) {
        return null;
    }

    @Override
    public void saveMovements(Movements movements) {

    }
}
