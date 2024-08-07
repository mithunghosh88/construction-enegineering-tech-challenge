package com.construction.engineering.service;

import com.construction.engineering.dao.ConstructionEngineeringDAO;
import com.construction.engineering.dao.ConstructionEngineeringDAOImpl;
import com.construction.engineering.enums.GeoZone;
import com.construction.engineering.enums.ProjectCode;
import com.construction.engineering.enums.TeamCode;
import com.construction.engineering.model.Contractor;
import com.construction.engineering.model.Customer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import java.time.Duration;
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
        Customer customer = new Customer.CustomerBuilder(2343225, GeoZone.US_EAST, TeamCode.RED_TEAM, ProjectCode.PROJECT_APPLE,new Contractor(2345), Duration.ofSeconds(3445)).build();
        constructionEngineeringService.saveEntity(customer);
    }
    @Test
    public void testDelete(){
        Customer customer = new Customer.CustomerBuilder(2343225, GeoZone.US_EAST, TeamCode.RED_TEAM, ProjectCode.PROJECT_APPLE,new Contractor(2345), Duration.ofSeconds(3445)).build();
        boolean success = constructionEngineeringService.delete(customer);
        Assert.assertTrue(success);
    }
    @After
    public void cleanUp(){
        constructionEngineeringDAO.getEntities().clear();
    }
}

