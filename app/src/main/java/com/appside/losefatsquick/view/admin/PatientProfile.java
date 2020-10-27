package com.appside.losefatsquick.view.admin;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appside.losefatsquick.R;
import com.appside.losefatsquick.models.PatientProcess;
import com.appside.losefatsquick.view.admin.viewmodels.PatientProfileViewModel;
import com.appside.losefatsquick.view.admin.viewmodels.PatientProfileViewModelFactory;

public class PatientProfile extends Fragment {

    public PatientProfileViewModel viewModel;
    public PatientProfileViewModelFactory viewModelFactory;

    public PatientProfile() {
        // Required empty public constructor
    }

    private void initContent(){
        if(this.viewModel != null){
            PatientProcess patient = new PatientProcess("", "", "", "", "", "", "");
            viewModelFactory = new PatientProfileViewModelFactory(patient);
            viewModel = new ViewModelProvider(this, viewModelFactory).get(PatientProfileViewModel.class);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_patient_profile, container, false);
    }
}