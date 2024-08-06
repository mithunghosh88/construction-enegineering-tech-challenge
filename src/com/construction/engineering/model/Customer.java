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

    public Customer(int customerId, GeoZone geoZone, TeamCode teamCode, ProjectCode projectCode, Contractor contractor, Duration duration) {
        this.customerId = customerId;
        this.geoZone = geoZone;
        this.teamCode = teamCode;
        this.projectCode = projectCode;
        this.contractor = contractor;
        this.duration = duration;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public GeoZone getGeoZone() {
        return geoZone;
    }

    public void setGeoZone(GeoZone geoZone) {
        this.geoZone = geoZone;
    }

    public TeamCode getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(TeamCode teamCode) {
        this.teamCode = teamCode;
    }

    public ProjectCode getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(ProjectCode projectCode) {
        this.projectCode = projectCode;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId && geoZone == customer.geoZone && teamCode == customer.teamCode && projectCode == customer.projectCode && Objects.equals(contractor, customer.contractor) && Objects.equals(duration, customer.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, geoZone, teamCode, projectCode, contractor, duration);
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
                '}';
    }
}
