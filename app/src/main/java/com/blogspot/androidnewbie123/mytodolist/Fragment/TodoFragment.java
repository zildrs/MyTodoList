package com.blogspot.androidnewbie123.mytodolist.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blogspot.androidnewbie123.mytodolist.R;
import com.blogspot.androidnewbie123.mytodolist.model.Todo;

/**
 * Created by Z3_Brothers on 10/22/18.
 */

/**
 * A simple {@link Fragment} subclass.
 */
public class TodoFragment extends Fragment {


    public TodoFragment() {
        // Required empty public constructor
    }

    String nama;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //toodo toodo = new Toodo(1, "makan malam", "makan malam bersama teman", "besok", "todo");
        // tampikan nama
        //Log.d("NAMA", todoo.getNama());
        // ubah nama
        //toodo.setNama("bermain bola");
        // tampilkan nama
        //Log.d("NAMA", todoo.getNama());
        return inflater.inflate(R.layout.fragment_todo, container, false);
    }

}
