package com.oay.eurekalcrts.domain.repository;

import com.oay.eurekalcrts.domain.entity.TableKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.Collection;

public class TableKeyRepository implements Repository <TableKey, String> {

    @Autowired
    private RedisTemplate<String,TableKey> redisTemplate;

    @Override
    public void add(TableKey tableKey) {

        ValueOperations<String, TableKey> valueOper = redisTemplate.opsForValue();
        valueOper.set(tableKey.getID(), tableKey);
    }

    @Override
    public TableKey get(String id) {
        ValueOperations<String, TableKey> valueOper = redisTemplate.opsForValue();
        return valueOper.get(id);
    }

    @Override
    public void remove(String id) {
        ValueOperations<String, TableKey> valueOper = redisTemplate.opsForValue();
        RedisOperations<String,TableKey> RedisOperations  = valueOper.getOperations();
        redisTemplate.delete(id);
    }

}
