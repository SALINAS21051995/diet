package com.appside.losefatsquick.view.patient.viewmodels;

import androidx.lifecycle.ViewModel;

import com.appside.losefatsquick.models.PatientProcess;

public class PatientProgressViewModel extends ViewModel {
    public PatientProcess patient;

    public PatientProgressViewModel(PatientProcess patient){
        this.patient = patient;
    }
}
