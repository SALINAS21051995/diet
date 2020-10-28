package com.appside.losefatsquick.view.admin.viewmodels;

import androidx.lifecycle.ViewModel;

import com.appside.losefatsquick.models.DashboardData;

public class DashboardViewModel extends ViewModel {

    public DashboardData data;

    public DashboardViewModel(DashboardData data){
        this.data = data;
    }



}
