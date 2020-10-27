package com.appside.losefatsquick.view.admin.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.appside.losefatsquick.models.PatientProcess;

public class PatientProfileViewModel extends ViewModel {

    public PatientProcess patient;

    public PatientProfileViewModel(PatientProcess patient){
        this.patient = patient;
    }

}

