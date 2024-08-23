package com.example.nehal24.ui.MenuManagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.nehal24.AddNewItem;
import com.example.nehal24.R;
import com.example.nehal24.view_item;

public class MenuManagementFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_menumanagement, container, false);

        View addItemButton = root.findViewById(R.id.add_item_button);
        addItemButton.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), AddNewItem.class);
            startActivity(intent);
        });

        View viewItemsButton = root.findViewById(R.id.view_items_button);
        viewItemsButton.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), view_item.class);
            startActivity(intent);
        });

        return root;
    }
}
