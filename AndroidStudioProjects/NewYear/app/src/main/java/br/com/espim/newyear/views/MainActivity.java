package br.com.espim.newyear.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.espim.newyear.R;
import br.com.espim.newyear.constants.NewYearConstants;
import br.com.espim.newyear.data.SecurityPreferences;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();
    private SecurityPreferences mSecurityPreferences;
    private static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mSecurityPreferences = new SecurityPreferences(this);

        this.mViewHolder.textToday = findViewById(R.id.text_today);
        this.mViewHolder.textDaysLeft = findViewById(R.id.text_days_left);
        this.mViewHolder.buttonConfirm = findViewById(R.id.button_confirm);

        this.mViewHolder.buttonConfirm.setOnClickListener(this);

        //Dates
        this.mViewHolder.textToday.setText(SIMPLE_DATE_FORMAT.format(Calendar.getInstance().getTime()));

        String daysLeft = String.format("%s %s", String.valueOf(this.getDaysLeft()), getString(R.string.days));
        this.mViewHolder.textDaysLeft.setText(daysLeft);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.verifyPresence();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.button_confirm)
        {
            String presence = this.mSecurityPreferences.getStoredString(NewYearConstants.PRESENCE_KEY);
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra(NewYearConstants.PRESENCE_KEY, presence);
            startActivity(intent);
        }

    }

    private void verifyPresence(){

        //No answer, yes, no
        String presence = this.mSecurityPreferences.getStoredString(NewYearConstants.PRESENCE_KEY);

        if(presence.equals(""))
        {
            this.mViewHolder.buttonConfirm.setText(getString(R.string.no_answer));
        }

        else if(presence.equals(NewYearConstants.CONFIRMATION_YES))
        {
            this.mViewHolder.buttonConfirm.setText(getString(R.string.yes));
        }

        else
        {
            this.mViewHolder.buttonConfirm.setText(getString(R.string.no));
        }
    }

    private int getDaysLeft(){
        //Date today
        Calendar calendarToday = Calendar.getInstance();
        int today = calendarToday.get(Calendar.DAY_OF_YEAR);

        //Day max of the year [1-365]
        Calendar calendarLastDay = Calendar.getInstance();
        int dayMax = calendarLastDay.getActualMaximum(Calendar.DAY_OF_YEAR);

        return dayMax - today;

    }
    private static class ViewHolder{
        TextView textToday;
        TextView textDaysLeft;
        Button buttonConfirm;
    }
}
