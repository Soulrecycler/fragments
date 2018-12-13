package com.example.lenovo.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class frag_home extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<contact> lstcontact ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        v = inflater.inflate(R.layout.frag_home, container,false);
        recyclerView = (RecyclerView)v.findViewById(R.id.homerecycler);
        RecyclerViewadapter recyclerViewadapter= new RecyclerViewadapter(getContext(),lstcontact);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewadapter);
       //  inflater.inflate(R.layout.frag_home, container,false);
        return v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstcontact=new ArrayList<>();
        lstcontact.add(new contact("shane","7414913988",R.drawable.mask));
        lstcontact.add(new contact("vijeeta","7414913988",R.drawable.female));
        lstcontact.add(new contact("archie","7414913988",R.drawable.male));
        lstcontact.add(new contact("jessio","7414913988",R.drawable.name));
        lstcontact.add(new contact("BATATATATTATA","7414913988",R.drawable.cat));
        lstcontact.add(new contact("shane","7414913988",R.drawable.mask));
        lstcontact.add(new contact("vijeeta","7414913988",R.drawable.female));
        lstcontact.add(new contact("archie","7414913988",R.drawable.male));
        lstcontact.add(new contact("jessio","7414913988",R.drawable.name));
        lstcontact.add(new contact("BATATATATTATA","7414913988",R.drawable.cat));
        lstcontact.add(new contact("shane","7414913988",R.drawable.mask));
        lstcontact.add(new contact("vijeeta","7414913988",R.drawable.female));
        lstcontact.add(new contact("archie","7414913988",R.drawable.male));
        lstcontact.add(new contact("jessio","7414913988",R.drawable.name));
        lstcontact.add(new contact("BATATATATTATA","7414913988",R.drawable.cat));

    }
}
