package br.com.p4rk.giveaway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void giveResult(View view){

        int number = new Random().nextInt(11);

        TextView text = findViewById(R.id.result);
        text.setText("The number choosed was: " + number);
    }
}
