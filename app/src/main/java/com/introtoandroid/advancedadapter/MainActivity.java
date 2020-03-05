package com.introtoandroid.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    Student s1 = new Student("Logan", "Shangrula", "Computer Science");
    Student s2 = new Student("Paul", "Henry", "Marketing");
    Student s3 = new Student("Kathy", "Donald", "Business");
    Student s4 = new Student("Von", "Bill", "Math");
    Student s5 = new Student("Shay", "Leigh", "Real Estate");

    ArrayList<Student> students = new ArrayList<>();

    StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        lv = findViewById(R.id.student);

        studentAdapter = new StudentAdapter(getApplicationContext(), students);
        lv.setAdapter(studentAdapter);


    }
}
