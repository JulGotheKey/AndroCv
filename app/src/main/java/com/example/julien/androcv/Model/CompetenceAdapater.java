package com.example.julien.androcv.Model;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.julien.androcv.R;

import java.util.ArrayList;

/**
 * Created by Julien on 13/04/2017.
 */

public class CompetenceAdapater extends BaseAdapter {

    private Activity context;
    private ArrayList<Competence> competences;

    public CompetenceAdapater(Activity context, ArrayList competences){
        this.context = context;
        this.competences = competences;
    }

    @Override
    public int getCount() {
        return competences.size();
    }

    @Override
    public Object getItem(int position) {
        return competences.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.adapter_competence, null);

        TextView textViewNomCompetence = (TextView) rowView.findViewById(R.id.textViewNomCompetence);
        RatingBar ratingBarCompetence = (RatingBar) rowView.findViewById(R.id.ratingBarCompetence);
        ImageView imageViewIconCompentence = (ImageView) rowView.findViewById(R.id.imageViewIconCompetence);
        //TextView textViewTypeCompetence = (TextView) rowView.findViewById(R.id.textViewTypeCompetence);

        ratingBarCompetence.setNumStars(5);
        int image = context.getResources().getIdentifier(competences.get(position).getSource(),"mipmap",context.getPackageName());

        textViewNomCompetence.setText(competences.get(position).getNom());
        ratingBarCompetence.setRating(competences.get(position).getRating());
        imageViewIconCompentence.setImageResource(image);
        //textViewTypeCompetence.setText(competences.get(position).getType());

        return rowView;
    }
}
