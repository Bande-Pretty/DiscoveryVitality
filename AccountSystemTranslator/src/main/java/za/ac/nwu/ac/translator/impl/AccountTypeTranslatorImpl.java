package za.ac.nwu.ac.translator.impl;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountTypeTranslatorImpl implements AccountTypeTranslator {
    private final AccountTypeRepository accountTypeRepository;

    @Autowired
    public AccountTypeTranslatorImpl(AccountTypeRepository accountTypeRepository){
        this.accountTypeRepository = accountTypeRepository;
    }

    @Override
    public List<AccountTypeDto> getAllAccountTypes(){
        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();
        try{
            for (AccountType accounttype : accountTypeRepository.findAll()){
                accountTypeDtos.add(new AccountTypeDto(AccountType));
            }
        }catch(Exception e){
            throw new RuntimeException("Unable to read from the DB",e);
        }

        return accountTypeDtos;
    }


    private class AccountTypeDto {
    }
}
