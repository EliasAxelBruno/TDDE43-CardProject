package com.example.cards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Card> cards = Arrays.asList(
                new Card("Taco", "Tacos", R.drawable.card_1, "id: 1"),
                new Card("Pokebowl", "Skål med poke", R.drawable.card_2, "id: 2"),
                new Card("Ratatouille", "Grönsaksschofräs", R.drawable.card_3, "id: 3"),
                new Card("Lasagne", "Pasta och köttfärsås fast platt och tillsammans", R.drawable.card_4, "id: 4"),
                new Card("Lax", "Fisken inte tusenlapp", R.drawable.card_5, "id: 5"),
                new Card("Kycklingmiddag", "Winner winner", R.drawable.card_6, "id: 6" )
        );

        CardArrayAdapter adapter = new CardArrayAdapter(this, cards);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }



}