package com.mustafasuleymankinik.androiddagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    School school;
    Button lessonButton,breakButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       define();
        DaggerSchoolComponent.builder().schoolModule(new SchoolModule(getApplication())).build().inject(this);
        lessonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                school.lessonTime();
            }
        });

        breakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                school.timeOut();
            }
        });

    }
    public void define()
    {
        lessonButton=findViewById(R.id.buttonLesson);
        breakButton=findViewById(R.id.buttonBreak);
    }
}