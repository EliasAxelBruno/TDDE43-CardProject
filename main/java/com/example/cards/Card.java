package com.example.cards;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
class Card {
    private String title;
    private String description;
    private int imageResourceId;
    private String id;

    public Card(String title, String description, int imageResourceId, String id) {
        this.title = title;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}