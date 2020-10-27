package com.appside.losefatsquick.view.admin;

import android.content.Context;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Toast;

import com.appside.losefatsquick.R;
import com.appside.losefatsquick.databinding.FragmentDashboardBinding;
import com.appside.losefatsquick.databinding.FragmentLoginBinding;
import com.appside.losefatsquick.models.PatientsListItem;
import com.appside.losefatsquick.view.util.MyPatientItemAdapter;

import java.util.ArrayList;
import java.util.List;


public class Dashboard extends Fragment implements MyPatientItemAdapter.OnItemClickListener {
    private FragmentDashboardBinding binding = null;
    private RecyclerView recyclerView = null;
    private List<PatientsListItem> patientsList = null;
    public Dashboard() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container, false);
        initComponents();
        return binding.getRoot();
    }

    private List<PatientsListItem> createUtilList(){
        patientsList = new ArrayList<PatientsListItem>();
        patientsList.add(new PatientsListItem("Carlos", "30", "Hr."));
        patientsList.add(new PatientsListItem("Ismael", "10", "Min."));
        patientsList.add(new PatientsListItem("Walker", "5", "Días."));
        return patientsList;
    }

    private void initComponents(){
        binding.patientsRecyclerView.setAdapter(new MyPatientItemAdapter(createUtilList(), this));
        binding.patientsRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        binding.patientsRecyclerView.setHasFixedSize(true);
        binding.patientsRecyclerView.getAdapter().notifyDataSetChanged();

    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(this.getActivity().getApplicationContext(), "hola", Toast.LENGTH_LONG).show();
    }
}