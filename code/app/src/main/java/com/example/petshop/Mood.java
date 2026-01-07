package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    // Attributes
    Date date;

    // Constructors
    public Mood() {
        this.date = new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String mood();
}
