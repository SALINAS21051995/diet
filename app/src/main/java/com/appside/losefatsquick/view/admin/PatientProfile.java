package com.appside.losefatsquick.view.admin;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appside.losefatsquick.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PatientProfile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PatientProfile extends Fragment {

    public PatientProfile() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_patient_profile, container, false);
    }
}