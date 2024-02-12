package com.iesam.openbank.features.banckProduct.presentation;

import com.iesam.openbank.features.banckProduct.data.BanckProductDataRepository;
import com.iesam.openbank.features.banckProduct.domain.BanckProduct;
import com.iesam.openbank.features.banckProduct.domain.SaveBanckProductUseCase;

public class MainBanckProduct {


    //Crear Cliente
    public static void createHipoteca(BanckProduct hipoteca){
        BanckProductDataRepository banckProductDataRepository = BanckProductDataRepository.newInstance();
        SaveBanckProductUseCase saveBanckProductUseCase=new SaveBanckProductUseCase(banckProductDataRepository);
        saveBanckProductUseCase.execute(hipoteca);
    }




}
