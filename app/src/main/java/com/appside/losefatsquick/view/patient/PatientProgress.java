package com.appside.losefatsquick.view.patient;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appside.losefatsquick.R;
import com.appside.losefatsquick.databinding.FragmentPatientProgressBinding;
import com.appside.losefatsquick.models.PatientProcess;
import com.appside.losefatsquick.view.admin.viewmodels.PatientProfileViewModel;
import com.appside.losefatsquick.view.admin.viewmodels.PatientProfileViewModelFactory;
import com.appside.losefatsquick.view.patient.viewmodels.PatientProgressViewModel;
import com.appside.losefatsquick.view.patient.viewmodels.PatientProgressViewModelFactory;
import com.google.gson.Gson;

public class PatientProgress extends Fragment {

    public FragmentPatientProgressBinding binding;
    public PatientProgressViewModel viewModel;
    public PatientProgress() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = DataBindingUtil.inflate(inflater, R.layout.fragment_patient_progress, container, false);
        initComponent();
        // Inflate the layout for this fragment
        return binding.getRoot();
    }



    private void initComponent(){
        Gson gson = new Gson();
        if(this.viewModel == null){
            PatientProcess patient = gson.fromJson(this.getArguments().getString("patientsProcess"), PatientProcess.class);
            PatientProgressViewModelFactory viewModelFactory = new PatientProgressViewModelFactory(patient);
            viewModel = new ViewModelProvider(this, viewModelFactory).get(PatientProgressViewModel.class);
        }
        this.binding.setPatient(this);
    }
}