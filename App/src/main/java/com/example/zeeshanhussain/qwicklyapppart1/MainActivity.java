package com.example.zeeshanhussain.qwicklyapppart1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.zeeshanhussain.qwicklyapppart1.FavoritesFeature.OpenImage;
import com.example.zeeshanhussain.qwicklyapppart1.Functionality.barcodescan.ProductDisplay;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button scan, favourite, offers;
        ImageView img;
        scan = (Button) findViewById(R.id.scanBtn);
        favourite = (Button) findViewById(R.id.favtBtn);
        offers = (Button) findViewById(R.id.OffersBtn);

        img = (ImageView) findViewById(R.id.logoImg);


        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //          startActivity(new Intent(this, BarcodeCaptureActivity.class));

                startActivity(new Intent(MainActivity.this, ProductDisplay.class));

            }
        });
        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openImagesActivity();
            }
        });


    }

    private void openImagesActivity() {
        Intent intent = new Intent(this, OpenImage.class);
        startActivity(intent);

    }
}