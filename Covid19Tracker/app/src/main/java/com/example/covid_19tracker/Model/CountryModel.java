package com.example.covid_19tracker.Model;

public class CountryModel {

    private String countryFlags,countryName,cases,todayCases,deaths,todayDeaths,active,recovered,critical;

    public CountryModel() {
    }

    public CountryModel(String countryFlags, String countryName, String cases, String todayCases,
                        String deaths, String todayDeaths, String active, String recovered, String critical) {
        this.countryFlags = countryFlags;
        this.countryName = countryName;
        this.cases = cases;
        this.todayCases = todayCases;
        this.deaths = deaths;
        this.todayDeaths = todayDeaths;
        this.active = active;
        this.recovered = recovered;
        this.critical = critical;
    }

    public String getCountryFlags() {
        return countryFlags;
    }

    public void setCountryFlags(String countryFlags) {
        this.countryFlags = countryFlags;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(String todayCases) {
        this.todayCases = todayCases;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(String todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }
}
