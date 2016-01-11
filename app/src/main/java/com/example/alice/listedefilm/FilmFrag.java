package com.example.alice.listedefilm;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Alice on 11/01/2016.
 */
public class FilmFrag extends ListFragment
{
    String[] film = {
            "Avatar","Rambo I", "Rambo II", "Rambo III", "Rambo V",
            "Alice au pays des merveilles", "Die Hard I", "Die Hard 2", "Die Hard 3",
            "Die Hard 4", "Pacific Rim"};

    ArrayAdapter<String> adapter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_selectable_list_item, film);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(getActivity(), "position : "+position, Toast.LENGTH_LONG).show();
        Intent envoi = new Intent(getActivity(), Description.class);
        envoi.putExtra("titre", film[position]);
        startActivity(envoi);
    }
}
