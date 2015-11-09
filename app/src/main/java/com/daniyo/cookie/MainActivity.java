package com.daniyo.cookie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hasteButtonPressed(View view){
        ImageView monkeyImage = (ImageView) findViewById(R.id.imageView);
        int visible = monkeyImage.getVisibility();
        if(visible == View.VISIBLE)
            monkeyImage.setVisibility(View.INVISIBLE);
        else
            monkeyImage.setVisibility(View.VISIBLE);
    }
}
