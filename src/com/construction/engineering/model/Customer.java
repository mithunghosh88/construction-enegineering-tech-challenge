package com.construction.engineering.model;

import com.construction.engineering.enums.GeoZone;
import com.construction.engineering.enums.ProjectCode;
import com.construction.engineering.enums.TeamCode;

import java.time.Duration;
import java.util.Objects;

public class Customer {
    private int customerId;
    private GeoZone geoZone;
    private TeamCode teamCode;
    private ProjectCode projectCode;
    private Contractor contractor;
    private Duration duration;
    //optional properties
    private String customerName;
    private String contactNumber;
    private Customer(CustomerBuilder builder) {
        this.customerId = builder.customerId;
        this.geoZone = builder.geoZone;
        this.teamCode = builder.teamCode;
        this.projectCode = builder.projectCode;
        this.contractor = builder.contractor;
        this.duration = builder.duration;
        this.customerName = builder.customerName;
        this.contactNumber = builder.contactNumber;
    }

    public int getCustomerId() {
        return customerId;
    }
    public GeoZone getGeoZone() {
        return geoZone;
    }
    public TeamCode getTeamCode() {
        return teamCode;
    }
    public ProjectCode getProjectCode() {
        return projectCode;
    }
    public Contractor getContractor() {
        return contractor;
    }
    public Duration getDuration() {
        return duration;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getContactNumber() {
        return contactNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId && geoZone == customer.geoZone && teamCode == customer.teamCode && projectCode == customer.projectCode && Objects.equals(contractor, customer.contractor) && Objects.equals(duration, customer.duration) && Objects.equals(customerName, customer.customerName) && Objects.equals(contactNumber, customer.contactNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, geoZone, teamCode, projectCode, contractor, duration, customerName, contactNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", geoZone=" + geoZone +
                ", teamCode=" + teamCode +
                ", projectCode=" + projectCode +
                ", contractor=" + contractor +
                ", duration=" + duration +
                ", customerName='" + customerName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }

    public static class CustomerBuilder{
        private int customerId;
        private GeoZone geoZone;
        private TeamCode teamCode;
        private ProjectCode projectCode;
        private Contractor contractor;
        private Duration duration;

        //optional properties
        private String customerName;
        private String contactNumber;

        public CustomerBuilder(int customerId, GeoZone geoZone, TeamCode teamCode, ProjectCode projectCode, Contractor contractor, Duration duration) {
            this.customerId = customerId;
            this.geoZone = geoZone;
            this.teamCode = teamCode;
            this.projectCode = projectCode;
            this.contractor = contractor;
            this.duration = duration;
        }

        public CustomerBuilder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public CustomerBuilder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }

}
