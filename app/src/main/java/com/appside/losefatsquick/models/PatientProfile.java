package com.appside.losefatsquick.models;

import java.util.List;

public class PatientProfile {
    private String name;
    private String height;
    private String weight;
    private String startedDate;
    private String IMC;
    private String calories;
    private List<DietColumns> week;
    private String actualDiet;

    public PatientProfile(String name, String height, String weight, String startedDate, String IMC, String calories, List<DietColumns> week, String diet){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.startedDate = startedDate;
        this.IMC = IMC;
        this.calories = calories;
        this.week = week;
        this.actualDiet = diet;
    }

    public String getActualDiet() {
        return actualDiet;
    }

    public void setActualDiet(String actualDiet) {
        this.actualDiet = actualDiet;
    }

    public List<DietColumns> getWeek() {
        return week;
    }

    public void setWeek(List<DietColumns> week) {
        this.week = week;
    }

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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(String startedDate) {
        this.startedDate = startedDate;
    }

    public String getIMC() {
        return IMC;
    }

    public void setIMC(String IMC) {
        this.IMC = IMC;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }
}
