package com.example.navdrawerexploring;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TigerFragment extends Fragment {

    private TigerViewModel mViewModel;

    public static TigerFragment newInstance() {
        return new TigerFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tiger, container, false);

        //connect the widgets
        //findViewById is a method from the View class --> but here it is something else
        TextView output = rootView.findViewById(R.id.output);
        EditText input = rootView.findViewById(R.id.input);
        Button one = rootView.findViewById(R.id.button);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String in = String.valueOf(input.getText());
                output.setText("Hello"+in);
            }
        });
       return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(TigerViewModel.class);
        // TODO: Use the ViewModel
    }

}