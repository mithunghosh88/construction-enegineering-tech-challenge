package com.construction.engineering.service;

import com.construction.engineering.dao.ConstructionEngineeringDAO;
import com.construction.engineering.dao.ConstructionEngineeringDAOImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

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

    }
    @Test
    public void testGetAvgBuildDurationBasedOnGeoZone(){

    }
    @Test
    public void testGetCustomerListBasedOnGeoZone(){

    }
    @After
    public void cleanUp(){
        constructionEngineeringDAO.getEntities().clear();
    }
}
