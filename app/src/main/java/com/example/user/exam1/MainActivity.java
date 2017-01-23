package com.example.user.exam1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView editText2;
    private TextView editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        editText2 = (TextView)findViewById(R.id.editText2);
        editText3 = (TextView)findViewById(R.id.editText3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextPage();
            }
        });
    }
}

    private void startNextPage(){
        Intent intent = new Intent();
        intent.setClass(this , Main2Activity.class);
        startActivity(intent);
    }