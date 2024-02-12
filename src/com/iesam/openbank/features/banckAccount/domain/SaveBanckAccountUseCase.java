package com.iesam.openbank.features.banckAccount.domain;

public class SaveBanckAccountUseCase {
    private BanckAccountRepository banckAccountRepository;

    public SaveBanckAccountUseCase(BanckAccountRepository banckAccountRepository) {
        this.banckAccountRepository = banckAccountRepository;
    }

    public void execute(BankAccount bankAccount){
        banckAccountRepository.saveBanckAccount(bankAccount);
    }

}
