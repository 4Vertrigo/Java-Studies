package br.com.espim.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.value = findViewById(R.id.edit_field);
        this.mViewHolder.textDollar = findViewById(R.id.text_dollar);
        this.mViewHolder.textEuro = findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate = findViewById(R.id.button_calculate);

        this.mViewHolder.buttonCalculate.setOnClickListener(this);

        this.clearValues();
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.button_calculate) {
            String value = this.mViewHolder.value.getText().toString();

            if("".equals(value))
            {
                //show message to user
                Toast.makeText(this, this.getString(R.string.insert_value), Toast.LENGTH_LONG).show();
            }

            else
            {
                Double real = Double.valueOf(value);

                this.mViewHolder.textDollar.setText(String.format("%.2f", (real/4)));
                this.mViewHolder.textEuro.setText(String.format("%.2f", (real/5)));
            }
        }
    }

    private void clearValues(){
        this.mViewHolder.textDollar.setText("");
        this.mViewHolder.textEuro.setText("");
    }

    private static class ViewHolder{ //I have mapped the ids just one time. This is default viewHolder
        EditText value; //getting the field
        TextView textDollar;
        TextView textEuro;
        Button buttonCalculate;
    }
}