package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository extends InMemoryRepository<Order> {
    protected void updateIfExists(Order original, Order updated) {
        original.setName(updated.getName());
        original.setType(updated.getType());
        original.setDescription(updated.getDescription());
        original.setCost(updated.getCost());
        original.setDate_created(updated.getDate_created());
        original.setCount(updated.getCount());
        original.setActive(updated.getActive());
    }
}