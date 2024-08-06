package com.construction.engineering.service;

import com.construction.engineering.dao.ConstructionEngineeringDAO;
import com.construction.engineering.dao.ConstructionEngineeringDAOImpl;
import com.construction.engineering.model.Customer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(JUnit4ClassRunner.class)
public class ConstructionEngineeringServiceTest {
    private ConstructionEngineeringService constructionEngineeringService;
    private ConstructionEngineeringDAO constructionEngineeringDAO;
    @Before
    public void init(){
        constructionEngineeringDAO = new ConstructionEngineeringDAOImpl();
        CustomerDataUtil.setDummyData(constructionEngineeringDAO);
        constructionEngineeringService = new ConstructionEngineeringServiceImpl(constructionEngineeringDAO);
    }
    @Test
    public void testGetEntities(){
        List<Customer> customers = constructionEngineeringService.getEntities();
        Assert.assertNotNull(customers);
        Assert.assertTrue(!customers.isEmpty());
        Assert.assertEquals(5,customers.size());
    }
    @Test
    public void testSaveEntity() {

    }
    @Test
    public void testDelete(){

    }
    @After
    public void cleanUp(){
        constructionEngineeringDAO.getEntities().clear();
    }
}

