package com.construction.engineering.service;

import com.construction.engineering.dao.ConstructionEngineeringDAO;
import com.construction.engineering.enums.GeoZone;
import com.construction.engineering.enums.ProjectCode;
import com.construction.engineering.enums.TeamCode;
import com.construction.engineering.model.Contractor;
import com.construction.engineering.model.Customer;

import java.time.Duration;

public class CustomerDataUtil {
    public static void setDummyData(ConstructionEngineeringDAO<Customer> constructionEngineeringDAO){
        constructionEngineeringDAO.saveEntity(new Customer.CustomerBuilder(2343225, GeoZone.US_EAST, TeamCode.RED_TEAM, ProjectCode.PROJECT_APPLE,new Contractor(2345), Duration.ofSeconds(3445)).build());
        constructionEngineeringDAO.saveEntity(new Customer.CustomerBuilder(2343225, GeoZone.US_WEST, TeamCode.BLUE_TEAM, ProjectCode.PROJECT_BANANA,new Contractor(2345), Duration.ofSeconds(2211)).build());
        constructionEngineeringDAO.saveEntity(new Customer.CustomerBuilder(3244332, GeoZone.EU_WEST, TeamCode.YELLOW_TEAM_3, ProjectCode.PROJECT_CARROT,new Contractor(2346), Duration.ofSeconds(4322)).build());
        constructionEngineeringDAO.saveEntity(new Customer.CustomerBuilder(1233456, GeoZone.US_WEST, TeamCode.BLUE_TEAM, ProjectCode.PROJECT_DATE,new Contractor(2345), Duration.ofSeconds(2221)).build());
        constructionEngineeringDAO.saveEntity(new Customer.CustomerBuilder(3244132, GeoZone.EU_WEST, TeamCode.YELLOW_TEAM_3, ProjectCode.PROJECT_EGG,new Contractor(2346), Duration.ofSeconds(4122)).build());
    }
}
