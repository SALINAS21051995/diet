package com.appside.losefatsquick.view.admin.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.appside.losefatsquick.models.PatientProcess;

public class PatientProfileViewModelFactory implements ViewModelProvider.Factory {
    private final PatientProcess patient;

    public PatientProfileViewModelFactory(PatientProcess patient){
        this.patient = patient;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(PatientProfileViewModel.class))
            return (T) new PatientProfileViewModel(patient);

        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}