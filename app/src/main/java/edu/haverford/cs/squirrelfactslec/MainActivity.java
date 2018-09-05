package edu.haverford.cs.squirrelfactslec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.squirrel_info);
        Button b = (Button) findViewById(R.id.squirrel_info_button);
    }
}
