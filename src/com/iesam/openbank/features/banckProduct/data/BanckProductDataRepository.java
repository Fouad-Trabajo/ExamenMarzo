package com.iesam.openbank.features.banckProduct.data;

import com.iesam.openbank.features.banckProduct.domain.BanckProduct;
import com.iesam.openbank.features.banckProduct.domain.BanckProductRepository;
import com.iesam.openbank.features.customer.data.CustomerDataRepository;

public class BanckProductDataRepository implements BanckProductRepository {


    private static CustomerDataRepository instance =null; //Instancia de patrón SingleTon

    //Método del patrón SingleTon
    public static BanckProductDataRepository newInstance(){
        if (instance==null){
            instance= new CustomerDataRepository();
        }
        return instance;
    }
    @Override
    public BanckProduct obtainHipoteca(String hipoteca) {
        return null;
    }

    @Override
    public void saveBanckProduct(BanckProduct banckProduct) {

    }
}
