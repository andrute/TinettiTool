package com.profinatech.tylergwilliam.tinettitool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class UserInfo extends Activity {
    public final static String PATIENT_NAME = "com.profinatech.tylergwilliam.tinettitool.PATIENT_NAME";
    public final static String ASSESSOR_NAME = "com.profinatech.tylergwilliam.tinettitool.ASSESSSOR_NAME";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.user_info, menu);
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
    public void userSubmit(View view) {
        Intent intent = new Intent (this, BalanceSectionActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.patientName);
        String patientName = editText1.getText().toString();
        EditText editText2 = (EditText)findViewById(R.id.assessorName);
        String assessorName = editText2.getText().toString();
        intent.putExtra(PATIENT_NAME, patientName);
        intent.putExtra(ASSESSOR_NAME,assessorName);
        startActivity(intent);
    }
}
