package com.appside.losefatsquick.models;

public class PatientProcess {
    private String name;
    private String height;
    private String lastWeight;
    private String age;
    private String actualWeight;
    private String weightDifference;
    private String time;

    public PatientProcess(String name, String height, String lastWeight, String age, String actualWeight, String weightDifference, String time){
        this.name = name;
        this.height = height;
        this.lastWeight = lastWeight;
        this.age = age;
        this.actualWeight = actualWeight;
        this.weightDifference = weightDifference;
        this.time = time;
    }
    public PatientProcess(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getLastWeight() {
        return lastWeight;
    }

    public void setLastWeight(String lastWeight) {
        this.lastWeight = lastWeight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getActualWeight() {
        return actualWeight;
    }

    public void setActualWeight(String actualWeight) {
        this.actualWeight = actualWeight;
    }

    public String getWeightDifference() {
        return weightDifference;
    }

    public void setWeightDifference(String weightDifference) {
        this.weightDifference = weightDifference;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
