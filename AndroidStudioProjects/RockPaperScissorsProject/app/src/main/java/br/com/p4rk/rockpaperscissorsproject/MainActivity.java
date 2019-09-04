package br.com.p4rk.rockpaperscissorsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    static final byte PAPER = 0;
    static final byte ROCK = 1;
    static final byte SCISSORS = 2;
    private byte userChoice;
    private byte iaChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Getters and Setters
    public void setUserChoice(byte userChoice){
        this.userChoice = userChoice;
    }

    public byte getUserChoice(){
        return this.userChoice;
    }

    public void setIaChoice(byte iaChoice){
        this.iaChoice = iaChoice;
    }

    public byte getIaChoice(){
        return this.iaChoice;
    }

    //Usual methods
    public void selectPaper(View view){
        setUserChoice(PAPER);
        this.optionSelected();
    }

    public void selectRock(View view){
        setUserChoice(ROCK);
        this.optionSelected();
    }

    public void selectScissors(View view){
        setUserChoice(SCISSORS);
        this.optionSelected();
    }

    public void changeImage(ImageView view, byte choice){

        switch (choice){

            case PAPER:
                view.setImageResource(R.drawable.papel);
                break;

            case ROCK:
                view.setImageResource(R.drawable.pedra);
                break;

            case SCISSORS:
                view.setImageResource(R.drawable.tesoura);
                break;
        }
    }


    public void optionSelected(){

        setIaChoice((byte) new Random().nextInt(3));
        ImageView iaOptionResult = findViewById(R.id.imageAppResult);
        ImageView myOptionResult = findViewById(R.id.imageYourResult);
        TextView result = findViewById(R.id.textResult);

        changeImage(iaOptionResult, getIaChoice());
        changeImage(myOptionResult, getUserChoice());

        if(getIaChoice() == getUserChoice())
            result.setText("This is a draw!");
        else if((getIaChoice() == PAPER && getUserChoice() == ROCK) || (getIaChoice() == ROCK && getUserChoice() == SCISSORS) || (getIaChoice() == SCISSORS && getUserChoice() == PAPER))
            result.setText("You lose! :(");
        else
            result.setText("You win! :)");

    }
}
