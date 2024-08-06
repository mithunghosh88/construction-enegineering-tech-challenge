package com.construction.engineering.service;

import com.construction.engineering.dao.ConstructionEngineeringDAO;
import com.construction.engineering.dao.ConstructionEngineeringDAOImpl;
import com.construction.engineering.exceptions.RecordNotFoundException;
import com.construction.engineering.model.Customer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Class ConstructionEngineeringServiceImpl
 */
public class ConstructionEngineeringReportServiceImpl implements ConstructionEngineeringReportService{
    private ConstructionEngineeringDAO<Customer> constructionEngineeringDAO;

    public ConstructionEngineeringReportServiceImpl(ConstructionEngineeringDAO<Customer> constructionEngineeringDAO){
        this.constructionEngineeringDAO = constructionEngineeringDAO;
    }
    /**
     * getCustomerBasedOnContractId() => The number of unique customerId for each contractId
     * @return
     */
    @Override
    public Map<Integer, Long> getCustomerBasedOnContractId() {
        List<Customer> records = constructionEngineeringDAO.getEntities();
        if(records.isEmpty())
            throw new RecordNotFoundException("Record not found!!!");
        Map<Integer, Long> numberOfCustomers = records.stream().collect(Collectors.groupingBy(e -> e.getContractor().getContractorId(),Collectors.counting()));
        return numberOfCustomers;
    }

    /**
     * getCustomerBasedOnGeoZone() => The number of unique customerId for each geozone
     * @return
     */
    @Override
    public Map<String, Long> getCustomerBasedOnGeoZone() {
        List<Customer> records = constructionEngineeringDAO.getEntities();
        if(records.isEmpty())
            throw new RecordNotFoundException("Record not found!!!");
        Map<String, Long> numberOfCustomers = records.stream().collect(Collectors.groupingBy(e -> e.getGeoZone().getValue(),Collectors.counting()));
        return numberOfCustomers;
    }

    /**
     * getAvgBuildDurationBasedOnGeoZone() => The average build duration for each geozone
     * @return
     */
    @Override
    public Map<String, Double> getAvgBuildDurationBasedOnGeoZone() {
        List<Customer> records = constructionEngineeringDAO.getEntities();
        if(records.isEmpty())
            throw new RecordNotFoundException("Record not found!!!");
        Map<String, Double> avgBuildDuration = records.stream().collect(Collectors.groupingBy(e -> e.getGeoZone().getValue(), Collectors.averagingDouble(e -> e.getDuration().getSeconds())));
        return avgBuildDuration;
    }

    /**
     * getCustomerListBasedOnGeoZone() => The list of unique customerId for each geozone
     * @return
     */
    @Override
    public Map<String, List<Customer>> getCustomerListBasedOnGeoZone() {
        List<Customer> records = constructionEngineeringDAO.getEntities();
        if(records.isEmpty())
            throw new RecordNotFoundException("Record not found!!!");
        Map<String, List<Customer>> numberOfCustomers = records.stream().collect(Collectors.groupingBy(e -> e.getGeoZone().getValue(),Collectors.toList()));
        return numberOfCustomers;
    }
}
