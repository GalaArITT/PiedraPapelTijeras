package com.example.oliver.piedrapapeltijeras;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

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
        imageView.setVisibility(View.VISIBLE);
        if (piedras_papel_tijeras.isRunning()) {
            piedras_papel_tijeras.stop();
        }
        piedras_papel_tijeras.start();
    }

    public void onStopBtnClick(View v) {
        piedras_papel_tijeras.stop();
    }
}
