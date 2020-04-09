package com.example.a01_fragmentos_estaticos;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrimerFragment extends Fragment {


    public PrimerFragment() {
        // Required empty public constructor
    }


    //El método onCreate del MainActivity no devuelve nada, en cambio este devuelve un objeto View
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_primer, container, false); //Devuelve la vista que está cargando el fragmento
    }

}
