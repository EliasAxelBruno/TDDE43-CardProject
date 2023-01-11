package com.example.cards;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class CardArrayAdapter extends ArrayAdapter<Card> implements AddLogic {
    private List<Card> cards;

    public CardArrayAdapter(Context context, List<Card> cards) {
        super(context, 0, cards);
        this.cards = cards;



    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Få data till card
        Card card = getItem(position);


        //Kolla om vi redan använder en View, annars inflate view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.card_item, parent, false);
        }




        //Hämta all data. Inmatad, beskrivning och bild
        TextView titleTextView = convertView.findViewById(R.id.title_text_view);
        TextView descriptionTextView = convertView.findViewById(R.id.description_text_view);
        ImageView imageView = convertView.findViewById(R.id.image_view);


        // Fyll upp rutor med data via mall från dataobjektet.
        titleTextView.setText(card.getTitle());
        descriptionTextView.setText(card.getDescription());
        imageView.setImageResource(card.getImageResourceId());
        convertView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) { //Om vi klickar på kort ska denna ske.
                clickChange(Integer.toString(position));
            }
        });


        //Return hela view för rendering
        return convertView;
    }

    @Override
    public void clickChange(String id) {//Från addLogic som man kan vidareutveckla och manipulera

        System.out.println("---------- Clicked: " + id );
    }
}