package com.example.oliver.piedrapapeltijeras;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private AnimationDrawable piedras_papel_tijeras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        if (imageView == null) throw new AssertionError();

        imageView.setVisibility(View.INVISIBLE);
        imageView.setBackgroundResource(R.drawable.spin_animation);


        piedras_papel_tijeras = (AnimationDrawable) imageView.getBackground();
        piedras_papel_tijeras.setOneShot(true);
    }


    public void onStartBtnClick(View v) {
        int img = (int) (Math.random() * 3);
        imageView.setVisibility(View.VISIBLE);
        if (piedras_papel_tijeras.isRunning()) {
            piedras_papel_tijeras.stop();
        }
        piedras_papel_tijeras.start();
        imageView.setVisibility(View.VISIBLE);
        piedras_papel_tijeras.start();
        Log.d("Variable img: ",""+img);
        if(img == 0){piedras_papel_tijeras.addFrame(getResources().getDrawable(R.drawable.piedra),200);};
        if(img == 1){piedras_papel_tijeras.addFrame(getResources().getDrawable(R.drawable.papel),200);};
        if(img == 2){piedras_papel_tijeras.addFrame(getResources().getDrawable(R.drawable.tijeras),200);};
    }



    public void onStopBtnClick(View v) {
        piedras_papel_tijeras.stop();
    }
}
