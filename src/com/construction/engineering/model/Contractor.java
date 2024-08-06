package com.construction.engineering.model;

import java.util.Objects;

public class Contractor {
    private int contractorId;

    public Contractor(int contractorId) {
        this.contractorId = contractorId;
    }

    public int getContractorId() {
        return contractorId;
    }

    public void setContractorId(int contractorId) {
        this.contractorId = contractorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contractor that = (Contractor) o;
        return contractorId == that.contractorId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(contractorId);
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "contractorId=" + contractorId +
                '}';
    }
}
