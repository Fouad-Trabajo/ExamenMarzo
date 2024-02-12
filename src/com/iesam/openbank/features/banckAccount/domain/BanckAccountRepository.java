package com.iesam.openbank.features.banckAccount.domain;

public interface BanckAccountRepository {
    BankAccount obtainBanckAccount(String banckAccount);


    void saveBanckAccount(BankAccount bankAccount);
}
