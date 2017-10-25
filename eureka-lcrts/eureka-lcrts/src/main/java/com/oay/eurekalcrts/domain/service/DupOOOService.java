package com.oay.eurekalcrts.domain.service;

import com.oay.eurekalcrts.domain.entity.TableKey;
import com.oay.eurekalcrts.domain.repository.TableKeyRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DupOOOService  {

    private TableKeyRepository tableKeyRepository;

    @Autowired
    public DupOOOService(TableKeyRepository tableKeyRepository) {

        this.tableKeyRepository = tableKeyRepository;
    }
/*
    @Override
    public void add(User user) throws Exception {
        if (userRepository.containsName(user.getName())) {
            throw new Exception(String.format("There is already a product with the name - %s", user.getName()));
        }

        if (user.getName() == null || "".equals(user.getName())) {
            throw new Exception("Booking name cannot be null or empty string.");
        }
        super.add(user);
    }
*/
}
