package com.appside.losefatsquick.view.admin.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.appside.losefatsquick.models.DashboardData;

public class DashboardViewModelFactory implements ViewModelProvider.Factory {
    private final DashboardData data;

    public DashboardViewModelFactory(DashboardData data){
        this.data = data;
    }


    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(DashboardViewModel.class))
            return (T) new DashboardViewModel(data);

        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
