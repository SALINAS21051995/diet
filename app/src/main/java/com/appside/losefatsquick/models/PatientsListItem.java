package com.appside.losefatsquick.models;

public class PatientsListItem {
    private String name = "";
    private String lastUpdate = "";
    private String measurementValue = "min.";

    public PatientsListItem(String name, String lastUpdate, String measurementValue){
        this.name = name;
        this.lastUpdate = lastUpdate;
        this.measurementValue = measurementValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getMeasurementValue() {
        return measurementValue;
    }

    public void setMeasurementValue(String measurementValue) {
        this.measurementValue = measurementValue;
    }
}
