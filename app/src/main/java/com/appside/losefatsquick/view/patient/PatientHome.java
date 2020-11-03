package com.appside.losefatsquick.view.patient;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appside.losefatsquick.R;
import com.appside.losefatsquick.databinding.FragmentPatientHomeBinding;
import com.appside.losefatsquick.models.DietColumns;
import com.appside.losefatsquick.models.PatientProcess;
import com.appside.losefatsquick.models.PatientProfile;
import com.appside.losefatsquick.view.patient.viewmodels.PatientHomeViewModel;
import com.appside.losefatsquick.view.patient.viewmodels.PatientHomeViewModelFactory;
import com.appside.losefatsquick.view.util.MyDietScheduleAdapter;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class PatientHome extends Fragment implements MyDietScheduleAdapter.OnItemClickListener {
    public FragmentPatientHomeBinding binding;
    public PatientHomeViewModel viewModel;
    public Gson gson;
    public PatientHome() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = DataBindingUtil.inflate(inflater, R.layout.fragment_patient_home, container, false);
        this.initComponent();
        // Inflate the layout for this fragment
        return this.binding.getRoot();
    }

    private void initComponent(){
        gson = new Gson();
        if(this.viewModel == null){
            PatientProfile paciente = new PatientProfile("Carlos Salinas Pina", "175 mts.", "75 kg.", "12/12/2020", "99", "1230", getDietColumns(), "Dieta de pito");
            PatientHomeViewModelFactory viewModelFactory = new PatientHomeViewModelFactory(paciente);
            viewModel = new ViewModelProvider(this, viewModelFactory).get(PatientHomeViewModel.class);
        }
        binding.dietRecyclerView.setAdapter(new MyDietScheduleAdapter(viewModel.patient.getWeek(), this));
        binding.dietRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        binding.dietRecyclerView.setHasFixedSize(true);
        binding.dietRecyclerView.getAdapter().notifyDataSetChanged();
        this.binding.setPatient(this);
    }

    @Override
    public void onItemClick(int position) {

    }

    public void goToNextView() {
        String json = gson.toJson(new PatientProcess(viewModel.patient.getName(), viewModel.patient.getWeight(), "100 kg."));
        Navigation.findNavController(this.getView()).navigate(PatientHomeDirections.actionPatientHomeToPatientProgress(json));
    }

    private List<DietColumns> getDietColumns(){
        List<DietColumns> diet = new ArrayList<>();
        diet.add(new DietColumns("1", "Lunes", "Columna 3", "Columna 4"));
        diet.add(new DietColumns("2", "Martes", "Columna 3", "Columna 4"));
        diet.add(new DietColumns("3", "Miercoles", "Columna 3", "Columna 4"));
        diet.add(new DietColumns("4", "Jueves", "Columna 3", "Columna 4"));
        diet.add(new DietColumns("5", "Viernes", "Columna 3", "Columna 4"));
        diet.add(new DietColumns("6", "Sabado", "Columna 3", "Columna 4"));
        diet.add(new DietColumns("7", "Domingo", "Columna 3", "Columna 4"));
        return diet;
    }
}