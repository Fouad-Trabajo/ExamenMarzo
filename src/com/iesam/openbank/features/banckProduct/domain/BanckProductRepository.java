package com.iesam.openbank.features.banckProduct.domain;

import com.iesam.openbank.features.customer.domain.Customer;

public interface BanckProductRepository {

    BanckProduct obtainHipoteca(String hipoteca); //GetBanckProductUseCase

    void saveBanckProduct(BanckProduct banckProduct); //SaveBanckProductUseCase
}
