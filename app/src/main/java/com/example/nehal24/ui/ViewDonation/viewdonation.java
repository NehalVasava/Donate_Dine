package com.example.nehal24.ui.ViewDonation;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.nehal24.R;

public class viewdonation extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root  = inflater.inflate(R.layout.fragment_viewdonation,container,false);



        return root;
    }

}