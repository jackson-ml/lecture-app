package edu.haverford.cs.squirrelfactslec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.squirrel_info);
        Button b = (Button) findViewById(R.id.squirrel_info_button);
        Squirrel s = new Squirrel("a", "b", "c");
        SquirrelList sl = new SquirrelList();
        for (int i = 0; i < 100; i++) {
            sl.add(s);
        }

        ArrayList<Squirrel> squirrels = sl.asArrayList();

    }

    @Override
    protected void onStart(){
        super.onStart();
        try {
            Thread.sleep(1000 * 20);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return;
    }
}
