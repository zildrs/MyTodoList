package com.blogspot.androidnewbie123.mytodolist.Fragment;

/**
 * Created by Z3_Brothers on 10/22/18.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blogspot.androidnewbie123.mytodolist.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DoneFragment extends Fragment {


    public DoneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_done, container, false);
    }

}

