package com.example.julien.androcv;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.example.julien.androcv.Model.Competence;
import com.example.julien.androcv.Model.CompetenceAdapater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Julien on 13/04/2017.
 */

public class CompetencesActivity extends AppCompatActivity {

    private ListView listViewCompetencesWeb;
    private ListView listViewCompetencesSystem;
    private ArrayList competencesWeb;
    private ArrayList competencesBdd;
    private ArrayList competencesSystem;
    private CompetenceAdapater adapaterWeb;
    private CompetenceAdapater adapaterSystem;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competences);

        listViewCompetencesWeb = (ListView) findViewById(R.id.listViewCompetencesWeb);
        competencesWeb = Competence.GenerateDefaultCompetences();

        listViewCompetencesSystem = (ListView) findViewById(R.id.listViewCompetencesSystem);
        competencesSystem = Competence.GenerateDefaultCompetencesSystem();

        adapaterWeb = new CompetenceAdapater(this,competencesWeb);
        listViewCompetencesWeb.setAdapter(adapaterWeb);


        adapaterSystem = new CompetenceAdapater(this, competencesSystem);
        listViewCompetencesSystem.setAdapter(adapaterSystem);
        ((BaseAdapter) listViewCompetencesSystem.getAdapter()).notifyDataSetChanged();
    }
}
