package com.appside.losefatsquick.view.patient.viewmodels;

import androidx.lifecycle.ViewModel;

import com.appside.losefatsquick.models.PatientProfile;

public class PatientHomeViewModel extends ViewModel {

    public PatientProfile patient;

    public PatientHomeViewModel(PatientProfile patient){
        this.patient = patient;
    }

}
