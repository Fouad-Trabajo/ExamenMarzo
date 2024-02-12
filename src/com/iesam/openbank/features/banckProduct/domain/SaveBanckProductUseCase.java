package com.iesam.openbank.features.banckProduct.domain;

public class SaveBanckProductUseCase {
    private BanckProductRepository banckProductRepository;

    public SaveBanckProductUseCase(BanckProductRepository banckProductRepository) {
        this.banckProductRepository = banckProductRepository;
    }

    public void execute(BanckProduct hipoteca){
        banckProductRepository.saveBanckProduct(hipoteca);
    }


}
