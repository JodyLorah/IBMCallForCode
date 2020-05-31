package com.example.globepage.ui.charities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.globepage.R;

public class CharitiesFragment extends Fragment {

    private CharitiesViewModel charitiesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        charitiesViewModel =
                ViewModelProviders.of(this).get(CharitiesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_charities, container, false);
        final TextView textView = root.findViewById(R.id.text_charities);
        charitiesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
