package com.construction.engineering.dao;

import com.construction.engineering.model.Customer;

import java.util.List;

public interface ConstructionEngineeringDAO<E> {
    List<E> getEntities();
    void saveEntity(E entity);
    E delete(E entity);
}
