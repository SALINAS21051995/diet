package com.appside.losefatsquick.view.admin;

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
import com.appside.losefatsquick.databinding.FragmentDashboardBinding;
import com.appside.losefatsquick.models.DashboardData;
import com.appside.losefatsquick.models.PatientProcess;
import com.appside.losefatsquick.models.PatientsListItem;
import com.appside.losefatsquick.view.admin.viewmodels.DashboardViewModel;
import com.appside.losefatsquick.view.admin.viewmodels.DashboardViewModelFactory;
import com.appside.losefatsquick.view.util.MyPatientItemAdapter;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;


public class Dashboard extends Fragment implements MyPatientItemAdapter.OnItemClickListener {
    private FragmentDashboardBinding binding;
    public DashboardViewModel viewModel;
    private Gson gson;
    public Dashboard() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container, false);
        initComponents();
        return binding.getRoot();
    }

    private List<PatientsListItem> createUtilList(){
        List<PatientsListItem> patientsList = new ArrayList<>();
        patientsList.add(new PatientsListItem(new PatientProcess("Carlos Salinas Pina", "175 mts", "90 kg", "25", "80 kg", "5 kg", "3 semanas"), "30", "Hr."));
        patientsList.add(new PatientsListItem(new PatientProcess("Ismael Ochoa Miranda", "180 mts", "90 kg", "25", "80 kg", "5 kg", "1 semanas"), "10", "Min."));
        patientsList.add(new PatientsListItem(new PatientProcess("Jesus Walker Ortiz", "174 mts", "90 kg", "25", "80 kg", "5 kg", "2 semanas"), "5", "Días."));
        return patientsList;
    }

    private void initComponents(){
        gson = new Gson();
        Dashboard dashboard = this;
        if(this.viewModel == null){
            DashboardViewModelFactory viewModelFactory = new DashboardViewModelFactory(new DashboardData(50, 40, 10, createUtilList(), "30 kilos"));
            viewModel = new ViewModelProvider(this, viewModelFactory).get(DashboardViewModel.class);
        }
        binding.patientsRecyclerView.setAdapter(new MyPatientItemAdapter(viewModel.data.getPatientsList(), this));
        binding.patientsRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        binding.patientsRecyclerView.setHasFixedSize(true);
        binding.patientsRecyclerView.getAdapter().notifyDataSetChanged();
        this.binding.setDashboard(dashboard);

    }

    @Override
    public void onItemClick(int position) {
        String json = gson.toJson(viewModel.data.getPatientsList().get(position).getPatientProcess());
        goToNextView(json);
    }

    private void goToNextView(String json){
        Navigation.findNavController(this.getView()).navigate(DashboardDirections.actionDashboardToPatientProfile(json));
    }
}