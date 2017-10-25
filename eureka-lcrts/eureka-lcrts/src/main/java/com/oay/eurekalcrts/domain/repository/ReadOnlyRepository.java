package com.oay.eurekalcrts.domain.repository;


import com.oay.eurekalcrts.domain.entity.Entity;


public interface ReadOnlyRepository <TE, T>{

    Entity get(T id);

}
