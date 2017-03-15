package com.sanchit.sanchitsharma.funfacts;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends ActionBarActivity {
    private FunFact f1 = new FunFact();
    private ColorSelector newColor = new ColorSelector();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        final Button B1 = (Button)findViewById(R.id.FunFactButton);
        final TextView T1 = (TextView)findViewById(R.id.FactText);
        final RelativeLayout rl1 = (RelativeLayout)findViewById(R.id.FunFactLayout);

        //Toast.makeText(this, "Good Morning!", Toast.LENGTH_LONG).show();
        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = newColor.GetColor();
                T1.setText(f1.GetFact());
                rl1.setBackgroundColor(color);
                B1.setTextColor(color);


            }
        };
        B1.setOnClickListener(Listener);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
