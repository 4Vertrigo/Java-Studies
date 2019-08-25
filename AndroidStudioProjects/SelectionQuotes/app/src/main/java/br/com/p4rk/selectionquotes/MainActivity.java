package br.com.p4rk.selectionquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newQuote(View view){

        ArrayList<String> quotes = new ArrayList<String>();

        quotes.add("Gnar gada!");
        quotes.add("What delightful agony we shall inflict.");
        quotes.add("You'd wish the world you know to end! Yeeesss...");
        quotes.add("I always take my toll - blood, or gold.");
        quotes.add("Shurima! Your emperor has returned!");
        quotes.add("To the arena!");
        quotes.add("Let us hunt those who have fallen to darkness.");
        quotes.add("I long for a worthy opponent.");
        quotes.add("Fired up and ready to serve.");
        quotes.add("I'm on the case.");
        quotes.add("Justice takes wing.");
        quotes.add("The tempest is at your command.");
        quotes.add("Agony, ecstasy, peace. Every passing has a beauty all its own.");
        quotes.add("Neither the flames nor the depths could claim me.");
        quotes.add("Rock solid.");
        quotes.add("Pleased to meet you!");
        quotes.add("In carnage, i bloom, like a flower in the dawn.");
        quotes.add("Naturally.");
        quotes.add("A guardian is always prepared.");
        quotes.add("Fortune doesn't favor fools!");
        quotes.add("This'll be a blast!");
        quotes.add("My blade is at your service!");
        quotes.add("Dead man walkin.");
        quotes.add("Indeed, a wise choice.");
        quotes.add("I will be the best.");
        quotes.add("Your bidding, master!");
        quotes.add("Fear not... I will make use of your corpse.");
        quotes.add("Know that if the tables were turned, I would show you no mercy!");
        quotes.add("The cycle of life and death continues. We will live, they will die.");
        quotes.add("I'm not big on sermons - broken bones teach better lessons.");

        int option = new Random().nextInt(quotes.size());

        TextView quote = findViewById(R.id.Quote);
        quote.setText(quotes.get(option));

    }
}
