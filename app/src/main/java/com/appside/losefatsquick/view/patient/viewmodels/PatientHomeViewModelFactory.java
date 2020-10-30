package com.appside.losefatsquick.view.patient.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.appside.losefatsquick.models.PatientProfile;
import com.appside.losefatsquick.view.admin.viewmodels.DashboardViewModel;

public class PatientHomeViewModelFactory implements ViewModelProvider.Factory {

    private final PatientProfile data;


    public PatientHomeViewModelFactory(PatientProfile data){
        this.data = data;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(PatientHomeViewModel.class))
            return (T) new PatientHomeViewModel(data);

        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
