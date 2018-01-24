package com.example.e_sai.codingfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

        private Button mSendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("message");


        mSendData = (Button) findViewById(R.id.SendData);

        mSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myRef.setValue("Salut comment ca va?");
            }
        });
    }
}
