package com.appside.losefatsquick.models;

import java.util.List;

public class DashboardData {

    private int manQuantity;
    private int womenQuantity;
    private int othersQuantity;
    private List<PatientsListItem> patientsList;
    private String totalLost;

    public DashboardData(int manQuantity, int womenQuantity, int othersQuantity, List<PatientsListItem> patientsList, String totalLost){
        this.manQuantity = manQuantity;
        this.womenQuantity = womenQuantity;
        this.othersQuantity = othersQuantity;
        this.patientsList = patientsList;
        this.totalLost = totalLost;
    }

    public int getManQuantity() {
        return manQuantity;
    }

    public void setManQuantity(int manQuantity) {
        this.manQuantity = manQuantity;
    }

    public int getWomenQuantity() {
        return womenQuantity;
    }

    public void setWomenQuantity(int womenQuantity) {
        this.womenQuantity = womenQuantity;
    }

    public int getOthersQuantity() {
        return othersQuantity;
    }

    public void setOthersQuantity(int othersQuantity) {
        this.othersQuantity = othersQuantity;
    }

    public List<PatientsListItem> getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(List<PatientsListItem> patientsList) {
        this.patientsList = patientsList;
    }

    public String getTotalLost() {
        return totalLost;
    }

    public void setTotalLost(String totalLost) {
        this.totalLost = totalLost;
    }
}
