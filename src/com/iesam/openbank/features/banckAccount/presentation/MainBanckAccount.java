package com.iesam.openbank.features.banckAccount.presentation;

import com.iesam.openbank.features.banckAccount.data.BanckAccountDataRepository;
import com.iesam.openbank.features.banckAccount.domain.BankAccount;
import com.iesam.openbank.features.banckAccount.domain.SaveBanckAccountUseCase;

public class MainBanckAccount {

    public static void createBanckAccount(BankAccount bankAccount){
        BanckAccountDataRepository banckAccountDataRepository = BanckAccountDataRepository.newInstance();
        SaveBanckAccountUseCase saveBanckAccountUseCase= new SaveBanckAccountUseCase(banckAccountDataRepository);
        saveBanckAccountUseCase.execute(bankAccount);
    }


}
