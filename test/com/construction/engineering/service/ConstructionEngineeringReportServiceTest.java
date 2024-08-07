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
import java.util.Map;


@RunWith(JUnit4ClassRunner.class)
public class ConstructionEngineeringReportServiceTest {
    private ConstructionEngineeringReportService constructionEngineeringReportService;
    private ConstructionEngineeringDAO constructionEngineeringDAO;
    @Before
    public void init(){
        constructionEngineeringDAO = new ConstructionEngineeringDAOImpl();
        CustomerDataUtil.setDummyData(constructionEngineeringDAO);
        constructionEngineeringReportService = new ConstructionEngineeringReportServiceImpl(constructionEngineeringDAO);
    }
    @Test
    public void testGetCustomerBasedOnContractId(){
        Map<Integer, Long> customers = constructionEngineeringReportService.getCustomerBasedOnContractId();
        Assert.assertNotNull(customers);
        Assert.assertTrue(!customers.isEmpty());
        Assert.assertEquals(3,customers.get(2345).longValue());
        Assert.assertEquals(2,customers.get(2346).longValue());
    }
    @Test
    public void testGetCustomerBasedOnGeoZone(){
        Map<String, Long> customers = constructionEngineeringReportService.getCustomerBasedOnGeoZone();
        Assert.assertNotNull(customers);
        Assert.assertTrue(!customers.isEmpty());
    }
    @Test
    public void testGetAvgBuildDurationBasedOnGeoZone(){
        Map<String, Double> avgDuration = constructionEngineeringReportService.getAvgBuildDurationBasedOnGeoZone();
        Assert.assertNotNull(avgDuration);
        Assert.assertTrue(!avgDuration.isEmpty());
    }
    @Test
    public void testGetCustomerListBasedOnGeoZone(){
        Map<String, List<Customer>> customers = constructionEngineeringReportService.getCustomerListBasedOnGeoZone();
        Assert.assertNotNull(customers);
        Assert.assertTrue(!customers.isEmpty());
    }
    @After
    public void cleanUp(){
        constructionEngineeringDAO.getEntities().clear();
    }
}
