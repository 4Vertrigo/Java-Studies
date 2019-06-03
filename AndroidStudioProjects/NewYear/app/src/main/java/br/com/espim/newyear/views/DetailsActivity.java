package br.com.espim.newyear.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import br.com.espim.newyear.R;
import br.com.espim.newyear.constants.NewYearConstants;
import br.com.espim.newyear.data.SecurityPreferences;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {

    ViewHolder mViewHolder = new ViewHolder();
    private SecurityPreferences mSecurityPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        this.mSecurityPreferences = new SecurityPreferences(this);

        mViewHolder.checkBoxParticipate = findViewById(R.id.checkbox_participate);
        this.mViewHolder.checkBoxParticipate.setOnClickListener(this);

        this.loadDataFromActivity();
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.checkbox_participate)
        {
            if(this.mViewHolder.checkBoxParticipate.isChecked())
            {
                //save the presence
                this.mSecurityPreferences.storeString(NewYearConstants.PRESENCE_KEY, NewYearConstants.CONFIRMATION_YES);
            }
            else
            {
                //save the absence
                this.mSecurityPreferences.storeString(NewYearConstants.PRESENCE_KEY, NewYearConstants.CONFIRMATION_NO);
            }
        }
    }

    private void loadDataFromActivity(){
        Bundle extras = getIntent().getExtras();

        if(extras != null)
        {
            String presence = extras.getString(NewYearConstants.PRESENCE_KEY);
            if(presence != null && presence.equals(NewYearConstants.CONFIRMATION_YES))
            {
                this.mViewHolder.checkBoxParticipate.setChecked(true);
            }

            else
            {
                this.mViewHolder.checkBoxParticipate.setChecked(false);
            }
        }
    }

    private static class ViewHolder{
        CheckBox checkBoxParticipate;
    }
}
