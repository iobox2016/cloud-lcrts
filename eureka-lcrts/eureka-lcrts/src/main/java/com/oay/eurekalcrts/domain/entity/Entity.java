package com.oay.eurekalcrts.domain.entity;

public abstract class Entity <T> {

    private T id;

    public Entity (T id) {
        this.id = id;
    }

    public T getID() { return id;}

}
