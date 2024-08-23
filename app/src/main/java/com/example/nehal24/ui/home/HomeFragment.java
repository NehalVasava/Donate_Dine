package com.example.nehal24.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.nehal24.R;
import com.example.nehal24.databinding.FragmentHomeBinding;
import com.example.nehal24.ui.DonateFood.donatefood;
import com.example.nehal24.ui.Profile.profile;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_home,container,false);



        return root;
    }

    public void openMenu(View view) {
        Intent myIntent = new Intent(HomeFragment.this.getActivity(), donatefood.class);

    }

    public void aplhu2(View view) {
        Intent myIntent = new Intent(HomeFragment.this.getActivity(), profile.class);

    }
}