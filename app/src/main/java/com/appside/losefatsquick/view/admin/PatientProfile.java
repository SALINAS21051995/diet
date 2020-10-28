package com.appside.losefatsquick.view.admin;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appside.losefatsquick.R;
import com.appside.losefatsquick.databinding.FragmentPatientProfileBinding;
import com.appside.losefatsquick.models.PatientProcess;
import com.appside.losefatsquick.view.admin.viewmodels.PatientProfileViewModel;
import com.appside.losefatsquick.view.admin.viewmodels.PatientProfileViewModelFactory;
import com.google.gson.Gson;

public class PatientProfile extends Fragment {

    public PatientProfileViewModel viewModel;
    public FragmentPatientProfileBinding binding;
    public PatientProfile() {
        // Required empty public constructor
    }

    private void initContent(){
        Gson gson = new Gson();
        if(this.viewModel == null){
            PatientProcess patient = gson.fromJson(this.getArguments().getString("patientsProcess"), PatientProcess.class);
            PatientProfileViewModelFactory viewModelFactory = new PatientProfileViewModelFactory(patient);
            viewModel = new ViewModelProvider(this, viewModelFactory).get(PatientProfileViewModel.class);
        }
        this.binding.setPatient(this);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = DataBindingUtil.inflate(inflater, R.layout.fragment_patient_profile, container, false);
        this.initContent();
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}