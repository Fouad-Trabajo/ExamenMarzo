package com.iesam.openbank.features.banckProduct.domain;

import com.iesam.openbank.features.customer.domain.Customer;

public class GetBanckProductUseCase {

    private BanckProductRepository banckProductRepository;

    public GetBanckProductUseCase(BanckProductRepository banckProductRepository) {
        this.banckProductRepository = banckProductRepository;
    }

    public BanckProduct execute(String hipoteca){
        return this.banckProductRepository.obtainHipoteca(hipoteca);
    }
}
