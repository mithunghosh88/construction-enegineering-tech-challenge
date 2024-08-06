package com.construction.engineering.service;

import com.construction.engineering.dao.ConstructionEngineeringDAO;
import com.construction.engineering.model.Customer;

import java.util.List;

public class ConstructionEngineeringServiceImpl implements ConstructionEngineeringService{
    private ConstructionEngineeringDAO constructionEngineeringDAO;

    public ConstructionEngineeringServiceImpl(ConstructionEngineeringDAO constructionEngineeringDAO){
        this.constructionEngineeringDAO = constructionEngineeringDAO;
    }
    @Override
    public List<Customer> getEntities() {
        return constructionEngineeringDAO.getEntities();
    }

    @Override
    public void saveEntity(Customer entity) {
        constructionEngineeringDAO.saveEntity(entity);
    }

    @Override
    public boolean delete(Customer entity) {
        return (boolean)constructionEngineeringDAO.delete(entity);
    }
}
