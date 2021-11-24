package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * This Activity shows a Streaming Service that features trending and already started content.
 * The user is able to click on the different ImageButtons which display movies and shows.
 * A click on a certain ImageButton will change its drawable.
 *
 * Layout File: activity_main.xml
 *
 * Photos:
 * talkshow.png by Jonah De Oliveira on Unsplash
 * zombie.png by Simon Hurry on Unsplash
 * boat.png by Johny vino on Unsplash
 *
 * @author Lukas Plenk
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton ib_TalkShow, ib_ZombieShow, ib_BoatDocumentary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib_TalkShow = findViewById(R.id.ib_talk_show);
        ib_ZombieShow = findViewById(R.id.ib_zombie_show);
        ib_BoatDocumentary = findViewById(R.id.ib_boat_documentary);

        ib_TalkShow.setOnClickListener(this);
        ib_ZombieShow.setOnClickListener(this);
        ib_BoatDocumentary.setOnClickListener(this);

        setStandardPictures();
    }

    /**
     * The method checks which ImageButton was clicked on.
     * It changes the drawable of this ImageButton.
     * @param view is the view that was clicked on.
     */
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        setStandardPictures();

        switch (view.getId()) {

            case R.id.ib_talk_show:
                ib_TalkShow.setImageResource(R.drawable.ic_play);
                ib_TalkShow.setScaleType(ImageView.ScaleType.CENTER);
                break;

            case R.id.ib_zombie_show:
                ib_ZombieShow.setImageResource(R.drawable.ic_play);
                ib_ZombieShow.setScaleType(ImageView.ScaleType.CENTER);
                break;

            case R.id.ib_boat_documentary:
                ib_BoatDocumentary.setImageResource(R.drawable.ic_play);
                ib_BoatDocumentary.setScaleType(ImageView.ScaleType.CENTER);
                break;
        }
    }

    /**
     * This method sets all ImageButtons to the drawables of the beginning.
     */
    private void setStandardPictures() {

        ib_TalkShow.setImageResource(R.drawable.talkshow);
        ib_TalkShow.setScaleType(ImageView.ScaleType.FIT_XY);

        ib_ZombieShow.setImageResource(R.drawable.zombie);
        ib_ZombieShow.setScaleType(ImageView.ScaleType.FIT_XY);

        ib_BoatDocumentary.setImageResource(R.drawable.boat);
        ib_BoatDocumentary.setScaleType(ImageView.ScaleType.FIT_XY);
    }
}