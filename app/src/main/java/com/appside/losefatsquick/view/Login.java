package com.appside.losefatsquick.view;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appside.losefatsquick.R;
import com.appside.losefatsquick.databinding.FragmentLoginBinding;


public class Login extends Fragment {

    private FragmentLoginBinding binding = null;


    public Login() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
        initComponents();
        return binding.getRoot();
    }

    private void initComponents(){
        binding.loginButton.setOnClickListener(v -> {
            System.out.println("hola");
        });
    }

}