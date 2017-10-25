package com.oay.eurekalcrts.domain.service;

import com.oay.eurekalcrts.domain.repository.Repository;

public abstract class ReadOnlyBaseService <TE, T> {

    private Repository<TE, T> repository;

    ReadOnlyBaseService (Repository<TE,T> repository)
    {
        this.repository=repository;
    }
}
