package com.appside.losefatsquick.models;

import com.appside.losefatsquick.view.admin.PatientProfile;

public class PatientsListItem {
    private String lastUpdate;
    private String measurementValue;
    private PatientProcess patientProcess;
    public PatientsListItem(PatientProcess patientProcess, String lastUpdate, String measurementValue){
        this.patientProcess = patientProcess;
        this.lastUpdate = lastUpdate;
        this.measurementValue = measurementValue;
    }

    public PatientProcess getPatientProcess() {
        return patientProcess;
    }

    public void setPatientProcess(PatientProcess name) {
        this.patientProcess = name;
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
