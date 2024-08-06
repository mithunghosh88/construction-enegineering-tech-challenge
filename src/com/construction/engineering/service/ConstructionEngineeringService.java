package com.construction.engineering.service;

import com.construction.engineering.model.Customer;

import java.util.List;

public interface ConstructionEngineeringService {
    List<Customer> getEntities();
    void saveEntity(Customer entity);
    boolean delete(Customer entity);
}
