package com.oay.eurekalcrts.domain.service;

import com.oay.eurekalcrts.domain.repository.ReadOnlyRepository;
import com.oay.eurekalcrts.domain.repository.Repository;

import java.util.Collection;

public abstract class BaseService <TE, T> extends ReadOnlyBaseService <TE, T> {

    private Repository<TE,T> _repository;

    BaseService(Repository<TE,T> repository) {
        super(repository);
        _repository=repository;
    }

    public void add(TE entity) throws Exception{
        _repository.add(entity);
    }


}
