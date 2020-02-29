package com.example.sharetext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button shareBtn;
    Intent shareIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shareBtn = (Button) findViewById(R.id.shareBtn);
        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareIntent = new Intent();
                shareIntent.setAction(shareIntent.ACTION_SEND);
                shareIntent.putExtra(shareIntent.EXTRA_TEXT,"Your text here");
                shareIntent.setType("text/plain");
                startActivity(shareIntent);
            }
        });
    }
}
