package com.construction.engineering.service;

import com.construction.engineering.model.Customer;

import java.util.List;
import java.util.Map;

public interface ConstructionEngineeringReportService {
    Map<Integer, Long> getCustomerBasedOnContractId();
    Map<String, Long> getCustomerBasedOnGeoZone();
    Map<String, Double> getAvgBuildDurationBasedOnGeoZone();
    Map<String, List<Customer>> getCustomerListBasedOnGeoZone();
}
