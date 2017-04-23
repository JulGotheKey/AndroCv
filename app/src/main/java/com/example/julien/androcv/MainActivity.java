package com.example.julien.androcv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonCompetences;
    private Button buttonFormation;
    private Button buttonExperiences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCompetences = (Button) findViewById(R.id.buttonCompetences);
        buttonCompetences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCompetences();
            }
        });
        buttonFormation = (Button) findViewById(R.id.buttonFormation);
        buttonFormation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFormation();
            }
        });
        buttonExperiences = (Button) findViewById(R.id.buttonExperiences);
        buttonExperiences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToExperience();
            }
        });
    }

    public void goToCompetences(){
        Intent competencesIntent = new Intent(getApplicationContext(), CompetencesActivity.class);
        startActivity(competencesIntent);
    }

    public void goToFormation(){
        Intent formationItent = new Intent(getApplicationContext(), FormationActivity.class);
        startActivity(formationItent);
    }

    public void goToExperience(){
        Intent experienceIntent = new Intent(getApplicationContext(), ExperienceActivity.class);
        startActivity(experienceIntent);
    }
}
