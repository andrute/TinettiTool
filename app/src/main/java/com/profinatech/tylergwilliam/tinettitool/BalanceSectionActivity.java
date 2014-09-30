package com.profinatech.tylergwilliam.tinettitool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class BalanceSectionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_section);
        Intent intent = getIntent();
        String patientName = intent.getStringExtra(UserInfo.PATIENT_NAME);
        String assessorName = intent.getStringExtra(UserInfo.ASSESSOR_NAME);
        final TextView textToChange = (TextView) findViewById(R.id.patient);
        textToChange.setText(patientName);
        textToChange.setTextSize(40);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.balance_section, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
