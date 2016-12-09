package com.enihsyou.shane.packagetracker;

import java.util.List;

public class CompanyAutoSearchResult {
    private String number;
    private List<CompanyEachAutoSearch> companies;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<CompanyEachAutoSearch> getCompanies() {
        return companies;
    }

    public void setCompanies(List<CompanyEachAutoSearch> companies) {
        this.companies = companies;
    }

    @Override
    public String toString() {
        return super.toString() + "@" + number;
    }
}
