package com.appside.losefatsquick.view.patient.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.appside.losefatsquick.models.PatientProcess;

public class PatientProgressViewModelFactory implements ViewModelProvider.Factory{
    private final PatientProcess patient;

    public PatientProgressViewModelFactory(PatientProcess patient){
        this.patient = patient;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(PatientProgressViewModel.class)) {
            return (T) new PatientProgressViewModel(patient);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
