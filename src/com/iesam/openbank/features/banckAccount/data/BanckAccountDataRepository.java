package com.iesam.openbank.features.banckAccount.data;

import com.iesam.openbank.features.banckAccount.domain.BanckAccountRepository;
import com.iesam.openbank.features.banckAccount.domain.BankAccount;

public class BanckAccountDataRepository implements BanckAccountRepository {

    private static BanckAccountDataRepository instance = null; //Instancia de patrón sinleTon

    //Patrón singleTon
    public static BanckAccountDataRepository newInstance(){
        if (instance==null){
            instance=new BanckAccountDataRepository();
        }
        return instance;
    }
    @Override
    public BankAccount obtainBanckAccount(String banckAccount) {
        return null;
    }

    @Override
    public void saveBanckAccount(BankAccount bankAccount) {

    }
}
