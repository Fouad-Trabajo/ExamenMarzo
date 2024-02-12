package com.iesam.openbank.features.banckAccount.domain;

public class GetBanckAccountUseCase {
    private BanckAccountRepository banckAccountRepository;

    public GetBanckAccountUseCase(BanckAccountRepository banckAccountRepository) {
        this.banckAccountRepository = banckAccountRepository;
    }

    public BankAccount execute(String banckAccount){
        return this.banckAccountRepository.obtainBanckAccount(banckAccount);
    }
}
